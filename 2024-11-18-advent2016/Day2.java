import java.io.*;
import java.util.*;

public class Day2 {
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

  public static int solverA(String[] data) {
    int[][] pad = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int x = 1;
    int y = 1;
    int combo = 0;
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length(); j++) {
        if (data[i].charAt(j) == 'U') {
          y--;
        }
        if (data[i].charAt(j) == 'D') {
          y++;
        }
        if (data[i].charAt(j) == 'L') {
          x--;
        }
        if (data[i].charAt(j) == 'R') {
          x++;
        }
        if (x < 0) {
          x = 0;
        }
        if (x > 2) {
          x = 2;
        }
        if (y < 0) {
          y = 0;
        }
        if (y > 2) {
          y = 2;
        }
      }
      combo = combo * 10 + pad[y][x];
    }
    return combo;

  }

  public static void main(String[] args) {
    String[] data = getData("Day2.txt");
    System.out.println(Arrays.deepToString(data));
    System.out.println(solverA(data));
  }
}