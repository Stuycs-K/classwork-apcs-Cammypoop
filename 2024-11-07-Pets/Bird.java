public class Bird extends Animal {
  private double height;
  private String color;

  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }

  public void speak(){
      super.speak();
      System.out.println ("My feathers are colored "+color +".");
      System.out.println ("I am "+height + " inches tall.");
  }




  //7:Override the getName() method so that a bid's name is "The Mighty NAME" instead of "NAME"
  //e.g. "The Mighty Polly" instead of just "Polly"
  //You can call the superclass' getName method using the syntax: super.getName()

  //Step 8:In Driver.java answer: What is the difference before and after you override this method?
  //What does this tell us about methods that are overridden?
  //public String getName(){  }

  //Go back and complete steps 9 onwards.

}
