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
    int damage = other.getmaxHP() / 20;
    other.applyDamage(damage);
    return ("You hit " + other.getName() + " with your lute for " + damage + " HP! They now have " + other.getHP() + " HP!");
  }


  //heal or buff the target adventurer
  public String support(Adventurer other){
    return "";
  }

  //heal or buff self
  public String support(){
    return "";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return "";
  }
}
