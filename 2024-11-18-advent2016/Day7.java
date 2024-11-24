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

    public static boolean ABBA(String in) {
        return (in.charAt(0) == in.charAt(3) && in.charAt(1) == in.charAt(2) && in.charAt(0) != in.charAt(1));
    }

    public static boolean TLS(String ip) {
        boolean abba = false;
        boolean bracket = false;
        for (int i = 0; i < ip.length() - 3; i++) {
            if (ip.charAt(i) == '[') {
                bracket = true;
                continue;
            } else if (ip.charAt(i) == ']') {
                bracket = false;
                continue;
            } else if (ABBA(ip.substring(i, i + 4)) && bracket) {
                return false;
            } else if (ABBA(ip.substring(i, i + 4))) {
                abba = true;
            }
        }
        return abba;
    }

    public static int solverA(String[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (TLS(data[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean ABA(String in) {
        return (in.charAt(0) == in.charAt(2) && in.charAt(0) != in.charAt(1));
    }

    public static boolean BAB(String in, String aba) {
        return (in.charAt(0) == aba.charAt(1) && in.charAt(1) == aba.charAt(0) && in.charAt(0) == in.charAt(2));
    }

    public static boolean SSL(String ip) {
        ArrayList<String> aba = new ArrayList<String>(ip.length() - 2);
        ArrayList<String> bab = new ArrayList<String>(ip.length() - 2);
        boolean bracket = false;
        for (int i = 0; i < ip.length() - 2; i++) {
            if (ip.charAt(i) == '[') {
                bracket = true;
                continue;
            } else if (ip.charAt(i) == ']') {
                bracket = false;
                continue;
            }
            if (bracket && ABA(ip.substring(i, i + 3))) {
                bab.add(ip.substring(i, i + 3));
            } else if (ABA(ip.substring(i, i + 3))) {
                aba.add(ip.substring(i, i + 3));
            }
        }
        for (int i = 0; i < aba.size(); i++) {
            for (int j = 0; j < bab.size(); j++) {
                 if (BAB(bab.get(j), aba.get(i))) {
                     return true;
                 }
            }
        }
        return false;
    }

    public static int solverB(String[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (SSL(data[i])) {
                // System.out.println(SSL(data[i])); 
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] data = getData("Day7.txt");
        // System.out.println(Arrays.deepToString(data));
        System.out.println(solverA(data));
        System.out.println(solverB(data));
    }
}