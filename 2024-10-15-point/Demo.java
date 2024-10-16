public class Demo{

    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      return (Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2)));
    }
  
    public static void main(String[]args){
      //Testing
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p4 = new Point(p3);
      Point p5 = new Point( -p3.getX(),p3.getY());
      System.out.println("p3:" + p3 + " p4:" + p4);
      System.out.println(distance(p1,p2));
      System.out.println(Point.distance(p1,p2));
      System.out.println(p1.distanceTo(p2));
      System.out.println(distance(p3, p4));
      System.out.println(distance(p4, p5));
      
      //Equilateral Triangle
      int sideLength = 1;
      Point A = new Point(0,0); // (0,0)
      Point B = new Point(A.getX() + sideLength, A.getY()); // (sideLength,0)
      Point C = new Point(A.getX() + sideLength/2, A.getY() + sideLength * Math.sqrt(3)/2); // (sideLength/2, sideLength/2 * sqrt(3))
      System.out.printf("Length of %s%s. Expected: %s Output: %s \n", "A", "B", sideLength, distance(A, B));
      System.out.printf("Length of %s%s. Expected: %s Output: %s \n", "B", "C", sideLength, distance(B, C));
      System.out.printf("Length of %s%s. Expected: %s Output: %s \n", "A", "C", sideLength, distance(A, C));

    }
  }