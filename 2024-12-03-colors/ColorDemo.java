public class ColorDemo {
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String RESET = "\u001b[0m";
    public static final String HIDE_CURSOR = "\u001b[?25l";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static final String MOVE_CURSOR_HOME = "\u001b[H";

    public static void color(int foreground, int background) {
        System.out.print("\u001b[" + foreground + ";" + background + "m");
    }

    public static void color(int foreground, int background, int modifier) {
        System.out.print("\u001b[" + foreground + ";" + background + ";" + modifier + "m");
    }

    public static void drawGrid(int cycle) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int foreground = 31 + (cycle + i + j) % 6;
                int background = 41 + (cycle + i + j) % 6;
                color(foreground, background);
                System.out.print("  ");
            }
            System.out.println(RESET);
        }
    }

    public static void sleep(int milli) {
        try {
            Thread.sleep(milli);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
        for (int cycle = 0; cycle < 20; cycle++) {
            System.out.print(MOVE_CURSOR_HOME);
            drawGrid(cycle);
            sleep(200);
        }
        System.out.print(RESET + SHOW_CURSOR);

    }
}