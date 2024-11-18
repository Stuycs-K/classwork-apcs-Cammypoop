import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day1 {

    public static int countDist(String filename) {
        try {
            int direct = 0;
            int xDist = 0;
            int yDist = 0;
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
              String d = input.next();
              int blocks = Integer.parseInt(d.substring(1,d.length()));
              if (d.charAt(0) == 'L'){
                direct--;
                direct += 4;
                direct %= 4;
              }
              if (d.charAt(0) == 'R'){
                direct++;
                direct += 4;
                direct %= 4;
              }
              if (direct == 0){
                yDist += blocks;
              }
              if (direct == 1){
                xDist += blocks;
              }
              if (direct == 2){
                yDist -= blocks;
              }
              if (direct == 3){
                xDist += blocks;
              }
            }
            input.close();
            return (xDist + yDist);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        }

    }


    public static void main(String[] args) {
      System.out.println(countDist("Day1In.txt"));
    }
}
