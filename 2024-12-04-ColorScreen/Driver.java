public class Driver {

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        drawBorder();
        displayNumbers(generateRandomNumbers());
        drawSeparator();
        System.out.print(Text.RESET);
        Text.go(31, 1);
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

    public static void displayNumbers(int[] numbers) {
        Text.go(2, 20);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print("                 ");
            }
        }
    }
    public static void drawSeparator() {
        Text.go(3, 2);
        Text.color(Text.BLUE, Text.background(Text.WHITE));
        for (int i = 1; i <= 78; i++) {
            System.out.print("-");
        }
    }

}
