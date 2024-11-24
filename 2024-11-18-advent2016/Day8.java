import java.io.*;
import java.util.*;

public class Day8 {
    public static int countLines(String filename) {
        int lineCount = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                input.nextLine();
                lineCount++;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return lineCount;
    }

    public static String[] getData(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int i = 0;
            String[] data = new String[countLines(filename)];
            while (input.hasNextLine()) {
                String line = input.nextLine();
                data[i] = line;
                i++;
            }
            input.close();
            return data;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return new String[] {};
        }
    }

    public static void rect(boolean[][] screen, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                screen[j][i] = true;
            }
        }
    }

    public static void rotateRow(boolean[][] screen, int xMagnitude, int yIndex) {
        boolean[] newRow = new boolean[50];
        for (int i = 0; i < 50; i++) {
            newRow[(i + xMagnitude) % 50] = screen[yIndex][i];
        }
        for (int i = 0; i < 50; i++) {
            screen[yIndex][i] = newRow[i];
        }
    }

    public static void rotateColumn(boolean[][] screen, int xIndex, int yMagnitude) {
        boolean[] newColumn = new boolean[6];
        for (int i = 0; i < 6; i++) {
            newColumn[(i + yMagnitude) % 6] = screen[i][xIndex];
        }
        for (int i = 0; i < 6; i++) {
            screen[i][xIndex] = newColumn[i];
        }
    }

    public static int solverA(String[] data) {
        int count = 0;
        boolean[][] screen = new boolean[6][50];
        for (int i = 0; i < data.length; i++) {
            if (data[i].startsWith("rect")) {
                String dimS = data[i].substring(5);
                String[] dim = dimS.split("x");
                rect(screen, Integer.parseInt(dim[0]), Integer.parseInt(dim[1]));
            }
            if (data[i].startsWith("rotate row")) {
                String dimS = data[i].substring(13);
                String[] dim = dimS.split(" by ");
                rotateRow(screen, Integer.parseInt(dim[1]), Integer.parseInt(dim[0]));
            }
            if (data[i].startsWith("rotate column")) {
                String dimS = data[i].substring(16);
                String[] dim = dimS.split(" by ");
                rotateColumn(screen, Integer.parseInt(dim[0]), Integer.parseInt(dim[1]));
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 50; j++) {
                if (screen[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // public static String solverB(String[] data) {

    // }

    public static void main(String[] args) {
        String[] data = getData("Day8.txt");
        System.out.println(Arrays.deepToString(data));
        System.out.println(solverA(data));
        // System.out.println(solverB(data));
    }
}