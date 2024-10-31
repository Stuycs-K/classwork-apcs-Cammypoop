import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("ReadFile.java");// 1
            Scanner input = new Scanner(file);
            // CODE THAT SCANS THE FILE.
            input.close();// releases the file from your program

        } catch (FileNotFoundException ex) {
            // File not found what should you do?
            System.out.println("File not found");
            return; // you can return from a void function just don't put a value.
        }
    }
}