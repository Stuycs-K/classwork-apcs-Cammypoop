import java.io.*;
import java.util.*;

public class Day6 {
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

    public static char findCommon(String in) {
        int[] frequency = new int[256]; 
        for (int i = 0; i < in.length(); i++) {
            frequency[in.charAt(i)]++;
        }
        char mostCommon = '\0';
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                mostCommon = (char) i;
                maxFrequency = frequency[i];
            }
        }

        return mostCommon;
    }

    public static String solverA(String[] data) {
        String out = "";
        for (int i = 0; i < data[i].length(); i++) {
            String column = "";
            for (int j = 0; j < data.length; j++) {
                column += data[j].charAt(i);
            }
            out += findCommon(column);
        }
        return out;
    }

    public static String solverB(String[] data) {
        return "";
    }

    public static void main(String[] args) {
        String[] data = getData("Day6.txt");
        System.out.println(Arrays.deepToString(data));
        System.out.println(solverA(data));
        System.out.println(solverB(data));
    }
}