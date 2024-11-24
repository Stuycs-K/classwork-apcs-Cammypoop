import java.io.*;
import java.util.*;

public class Day7 {
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

    public static boolean isABBA(String in) {
        return (in.charAt(0) == in.charAt(3) && in.charAt(1) == in.charAt(2) && in.charAt(0) != in.charAt(1));
    }

    public static boolean isIP(String ip) {
        boolean abba = false;
        boolean bracket = false;
        for (int i = 0; i < ip.length() - 3; i++) {
            if (ip.charAt(i) == '[') {
                bracket = true;
                continue;
            } else if (ip.charAt(i) == ']') {
                bracket = false;
                continue;
            } else if(isABBA(ip.substring(i, i + 4)) && bracket) {
                return false;
            } else if (isABBA(ip.substring(i, i + 4))) {
                abba = true;
            }
        }
        return abba;
    }

    public static int solverA(String[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (isIP(data[i])){
                count++;
            }
        }
        return count;
    }

    public static String solverB(String[] data) {
        String out = "";

        return out;
    }

    public static void main(String[] args) {
        String[] data = getData("Day7.txt");
        // System.out.println(Arrays.deepToString(data));
        System.out.println(solverA(data));
        System.out.println(solverB(data));
    }
}