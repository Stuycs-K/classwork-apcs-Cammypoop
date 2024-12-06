import java.util.Random;
public class Bard extends Adventurer{
  private String name;
  private int HP,maxHP;
  private int notes, maxNotes;
  public Bard(String name){
      super(name);
      
  }

  public Bard(String name, int hp){
      super(name, hp);
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
  public abstract int getSpecial(){
    return notes;
  }
  public abstract void setSpecial(int n){
    notes = n;
  }
  public abstract int getSpecialMax(){
    return maxNotes;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  // public abstract String attack(Adventurer other);

  //heall or buff the target adventurer
  // public abstract String support(Adventurer other);

  //heall or buff self
  // public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  // public abstract String specialAttack(Adventurer other);
}
