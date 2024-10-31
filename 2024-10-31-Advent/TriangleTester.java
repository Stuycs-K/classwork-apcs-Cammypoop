import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
    public static boolean TestTriangle(int s1, int s2, int s3){
        if (s1 + s2 > s3 || s2 + s3 > s1 || s1 + s3 > s2){
            return true;
        }
        return false;
    }
    public static int countTrianglesA(String filename){
        int count = 0;
        try {
            File file = new File("inputTri.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                int s1 = input.nextInt();
                int s2 = input.nextInt();
                int s3 = input.nextInt();
                TestTriangle(s1, s2, s3);
            }
            input.close();

        } catch (FileNotFoundException ex) {
            // File not found what should you do?
            System.out.println("File not found");
            return 0;
        }
        return count;
    }
}
