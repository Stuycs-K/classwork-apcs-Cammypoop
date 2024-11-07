// Overriding the bird's getName method made it say that its name is "The Mighty" whatever.
// This made the Bird.speak() method also change, but did not affect the parent Animal class.
//
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
