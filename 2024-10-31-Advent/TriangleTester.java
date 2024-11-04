import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TriangleTester {
    public static boolean TestTriangle(int s1, int s2, int s3) {
        return (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2);
    }

    public static int countTrianglesA(String filename) {
        try {
            int count = 0;
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                int s1 = input.nextInt();
                int s2 = input.nextInt();
                int s3 = input.nextInt();
                if (TestTriangle(s1, s2, s3)) {
                    count++;
                }
            }
            input.close();
            return count;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        }

    }

    public static int countTrianglesB(String filename) {
        int count = 0;
        try {
            for (int column = 0; column < 3; column++) {
                File file = new File(filename);
                Scanner input = new Scanner(file);
                while (input.hasNextLine()) {
                    for (int i = 0; i < column; i++) { // shift to the correct column
                        input.nextInt();
                    }
                    int s1 = input.nextInt();
                    input.nextInt();
                    input.nextInt();
                    int s2 = input.nextInt();
                    input.nextInt();
                    input.nextInt();
                    int s3 = input.nextInt();
                    if (TestTriangle(s1, s2, s3)) {
                        count++;
                    }
                    for (int i = column; i < 2; i++) { // go to the end of the row
                        input.nextInt();
                    }
                }
                input.close();
            }
            return count;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        } catch (NoSuchElementException ex) {
            System.out.println("Next int doesn't exist. Count: " + count);
            ex.printStackTrace();
            System.exit(1);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(countTrianglesA("inputTri.txt"));
        System.out.println(countTrianglesB("inputTri.txt"));
    }
}
