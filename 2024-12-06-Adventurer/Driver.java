public class Driver{

  public static void main(String[] args){
    Adventurer enemy = new Bard("Target Dummy", 100);
    Adventurer hero = new Bard("Chad", 100);
    Adventurer teammate = new Bard("Brad", 100);

    System.out.println(hero.attack(enemy));
    System.out.println(hero.support(teammate));
    System.out.println(hero.support());
    System.out.println(hero.specialAttack(enemy));
  }
}
