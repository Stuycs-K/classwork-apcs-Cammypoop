public class Driver{

  public static void main(String[] args){
    Adventurer Dummy = new Bard("Dummy");

    Adventurer Chad = new Bard("Chad");

    System.out.println(Chad.attack(Dummy));
  }
}
