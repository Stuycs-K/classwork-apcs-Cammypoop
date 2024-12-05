public class Driver {
    

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
    }
    public static void drawBorder() {
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 80; j++) {
                Text.go(i, j);
                if (i == 1 || i == 30 || j == 1 || j == 80) {
                    Text.color(Text.RED, Text.background(Text.CYAN));
                    System.out.print("#");
                }
            }
        }
    }
}
