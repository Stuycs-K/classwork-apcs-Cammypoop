import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;

public class Day2 {
    public static String[] getData(String filename){
      try{
        File file = new File(filename);
        Scanner input = new Scanner(file);
        int i = 0;
        String[] data = new String[5];
        while (input.hasNextLine()){
          String line = input.nextLine();
          data[i] = line;
          i++;
        }
        return data;
      } catch (FileNotFoundException ex) {
          System.out.println("File not found");
          return new String[]{};
      }
    }
    public static int solverA(String[] data) {
        
    }


    public static void main(String[] args) {
      String[] data = getData("Day2.txt");
      System.out.println(Arrays.toString(data));
      System.out.println(data.length);
    }
}
