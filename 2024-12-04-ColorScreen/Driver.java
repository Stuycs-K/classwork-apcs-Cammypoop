import java.util.*;

public class Driver {

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        drawBorder();
        System.out.print(Arrays.toString(generateRandomNumbers()));
        System.out.print(Text.RESET);
    }

    public static void drawBorder() {
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 80; j++) {
                Text.go(i, j);
                if (i == 1 || i == 30 || j == 1 || j == 80) {
                    Text.color(Text.RED, Text.background(Text.CYAN));
                    System.out.print("+");
                }
            }
        }
    }

    public static int[] generateRandomNumbers() {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }


}
