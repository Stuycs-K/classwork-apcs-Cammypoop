import java.util.Scanner;

public class Driver {
    public static String heroAction(Adventurer hero, Adventurer enemy, String input) {
        switch (input) {
        case "q":
        case "quit":
            System.exit(0);
            return "";
        case "a":
        case "attack":
            return hero.attack(enemy);
        case "sp":
        case "special":
            return hero.specialAttack(enemy);
        case "su":
        case "support":
            return hero.support();
        default:
            return "Invalid Input, enter again";
        }
    }

    

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Adventurer enemy = new CodeWarrior("Brad");
        Adventurer hero;

        System.out.println("Enter your username: ");
        String userName = userInput.nextLine();
        hero = new Bard(userName);
        System.out.println("Your username is: " + userName);
        System.out.println("Fight!");
        while (true) {
            System.out.println(
                    hero.getName() + ", " + hero.getHP() + "/" + hero.getmaxHP() + " HP, " + hero.getSpecial() + "/"
                            + hero.getSpecialMax() + " " + hero.getSpecialName());
            System.out
                    .println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, "
                            + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
            System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
            String input = userInput.nextLine();

            String returned = heroAction(hero, enemy, input);
            System.out.println(returned);

            if (returned.equals("Invalid Input, enter again")) {
                continue;
            }
        }

    }
}
