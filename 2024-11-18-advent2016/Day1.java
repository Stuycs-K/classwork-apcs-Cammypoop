import java.io.*;
import java.util.*;

public class Day1 {
  public static int countDistA(String filename) {
    try {
      int direct = 0;
      int x = 0;
      int y = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        String d = input.next();
        int blocks = Integer.parseInt(d.substring(1, d.length() - 1));
        if (d.charAt(0) == 'L') {
          direct += 3;
          direct %= 4;
        }
        if (d.charAt(0) == 'R') {
          direct++;
          direct %= 4;
        }
        if (direct == 0) {
          y += blocks;
        }
        if (direct == 1) {
          x += blocks;
        }
        if (direct == 2) {
          y -= blocks;
        }
        if (direct == 3) {
          x -= blocks;
        }
      }
      input.close();
      return (Math.abs(x) + Math.abs(y));
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static int countDistB(String filename) {
    try {
      int direct = 0;
      int x = 0;
      int y = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      ArrayList<String> visited = new ArrayList<>();
      visited.add("0,0");
      while (input.hasNext()) {
        String d = input.next();
        int blocks = Integer.parseInt(d.substring(1, d.length() - 1));
        if (d.charAt(0) == 'L') {
          direct += 3;
          direct %= 4;
        }
        if (d.charAt(0) == 'R') {
          direct++;
          direct %= 4;
        }
        if (direct == 0) {
          y += blocks;
        }
        if (direct == 1) {
          x += blocks;
        }
        if (direct == 2) {
          y -= blocks;
        }
        if (direct == 3) {
          x -= blocks;
        }
        String position = x + "," + y;
        if (visited.contains(position)) {
          input.close();
          return Math.abs(x) + Math.abs(y);
        }
        visited.add(position);
      }
      input.close();
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(countDistA("Day1In.txt"));
    System.out.println(countDistB("Day1In.txt"));
  }
}
