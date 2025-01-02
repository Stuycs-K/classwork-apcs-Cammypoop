import java.util.Scanner;
import java.util.Random;

public class Driver {
    public static String heroAction(Adventurer hero, Adventurer enemy, String input) {
        switch (input) {
            case "q":
            case "quit":
                System.exit(0);
                return ""; // satisfy compiler
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

    public static String enemyRNGAction(Adventurer hero, Adventurer enemy) {
        Random rand = new Random();
        int input = rand.nextInt(3);
        switch (input) {
            case 0:
                return enemy.attack(hero);
            case 1:
                return enemy.specialAttack(hero);
            case 2:
                return enemy.support();
            default:
                return ""; // satisfy compiler
        }
    }

    public static String deathCheck(Adventurer hero, Adventurer enemy) {
        if (hero.getHP() <= 0) {
            return "You died.";
        } else if (enemy.getHP() <= 0) {
            return enemy.getName() + " died.";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Adventurer enemy = new CodeWarrior("Brad");
        Adventurer hero;

        System.out.println("Enter your username: ");
        String user = userInput.nextLine();
        hero = new Bard(user);
        System.out.println("Your username is: " + user);
        System.out.println("Enter your enemy's username: ");
        String enemyUser = userInput.nextLine();
        hero = new Bard(enemyUser);
        System.out.println("Your enemy's username is: " + enemyUser);
        System.out.println("\nFighting " + enemy.getName() + "!");
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
            if (deathCheck(hero, enemy) != "") {
                System.out.println(deathCheck(hero, enemy));
                System.exit(0);
            }
            System.out.println(enemyRNGAction(hero, enemy));

            if (deathCheck(hero, enemy) != "") {
                System.out.println(deathCheck(hero, enemy));
                System.exit(0);
            }
        }

    }
}
