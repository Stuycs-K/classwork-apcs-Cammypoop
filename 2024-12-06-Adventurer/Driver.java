import java.util.Scanner;

public class Driver {
    public static String loop(Adventurer hero, Adventurer enemy, Scanner userInput) {
        System.out.println(
                hero.getName() + ", " + hero.getHP() + "/" + hero.getmaxHP() + " HP, " + hero.getSpecial() + "/"
                        + hero.getSpecialMax() + " " + hero.getSpecialName());
        System.out
                .println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial()
                        + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String input = userInput.nextLine();
        if (input == "a" || input == "attack") {
            return hero.attack(enemy);
        } else if (input == "sp" || input == "special") {
            return hero.specialAttack(enemy);
        } else if (input == "su" || input == "support") {
            return hero.support();
        } else if (input == "q" || input == "quit") {
            return "EXIT";
        } else {
            return "Invalid Input";
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
            String returned = loop(hero, enemy, userInput);
            if (returned == "EXIT"){
                break;
            }
            if (returned == "Invalid Input"){
                continue;
            }
            System.out.println(returned);
        }

    }
}
