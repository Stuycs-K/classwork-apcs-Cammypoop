public class Driver
{
  public static void main(String[] args)
  {
    Animal animal1 = new Animal("moo", 13, "Cow");
    animal1.speak();
    Animal animal2 = new Animal("woof", 5, "Dog");
    animal2.speak();
    Bird bird1 = new Bird("caw", 5, "Crow", 5.0, "Black");
    bird1.speak();
  }
}
