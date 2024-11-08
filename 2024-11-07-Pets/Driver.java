// Overriding the bird's getName method made it say that its name is "The Mighty" whatever.
// This made the Bird.speak() method also change, but did not affect the parent Animal class.
//
// All of the ones that work, work, because an Animal is an Animal, a Bird is a Bird and also an Animal,
// but a Animal is not necessarily a Bird.
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
    Animal animalbird = new Bird("caw", 5, "Crow2", 5.0, "Black");
    animalbird.speak(); // animalbird runs Bird method as an Animal
    // Bird bird2 = new Animal("meow", 7, "Cat"); Compiler error
    //bird2.speak();
  }
}