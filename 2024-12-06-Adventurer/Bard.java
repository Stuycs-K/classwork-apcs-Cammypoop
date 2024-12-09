import java.util.Random;
public class Bard extends Adventurer{
  private String name;
  private int HP,maxHP;
  private int notes, maxNotes;
  public Bard(String name){
      super(name);
      maxNotes = 50;
      notes = maxNotes;
  }

  public Bard(String name, int hp){
      super(name, hp);
      maxNotes = 50;
      notes = maxNotes;
  }

  public Bard(String name, int hp, int notes){
      super(name, hp);
      maxNotes = notes;
      this.notes = maxNotes;
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "notes";
  }
  //accessor methods
  public int getSpecial(){
    return notes;
  }
  public void setSpecial(int n){
    notes = n;
  }
  public int getSpecialMax(){
    return maxNotes;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    Random rand = new Random();
    int damage = other.getmaxHP() / (int) (rand.nextInt(6) + 5); // deals 5%-10% of target's max HP
    other.applyDamage(damage);
    setSpecial(restoreSpecial(4) + getSpecial());
    return ("You hit " + other.getName() + " with your lute for " + damage + " HP! They now have " + other.getHP() + " HP!");
  }


  //heal or buff the target adventurer
  public String support(Adventurer other){
    Random rand = new Random();
    int heal = other.getmaxHP() / (int) (rand.nextInt(6) + 5); // heals 5%-10% of target's max HP
    other.applyDamage(-heal);
    return ("You played some soothing songs for " + other.getName() + " with your lute for " + heal + " HP! They now have " + other.getHP() + " HP!");
  }

  //heal or buff self
  public String support(){
    Random rand = new Random();
    int heal = getmaxHP() / (int) (rand.nextInt(6) + 5); // heals 5%-10% max HP
    applyDamage(-heal);
    return ("You played some soothing songs for " + heal + " HP! You now have " + getHP() + " HP!");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (getSpecial() < 20){
      return ("You don't have enough " + getSpecialName() + "to jam, so instead: " + attack(other));
    }
    setSpecial(getSpecial() - 20);
    Random rand = new Random();
    int debuff = getmaxHP() / (int) (rand.nextInt(11) + 10); // removes & damages 10%-20% of target's max HP
    other.setmaxHP(other.getmaxHP() - debuff);
    other.applyDamage(debuff);
    return("You jammed your lute so hard, you weakened " + other.getName() + " for " + debuff + " HP! They now have " + other.getHP() + " HP and " + other.getmaxHP() + " max HP!");
  }
}
