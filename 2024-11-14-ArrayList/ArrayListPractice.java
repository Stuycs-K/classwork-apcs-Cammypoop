import java.util.*;
public class ArrayListPractice{
  public static void main(String[] args) {
    ArrayList<String> test = createRandomArray(30);
    System.out.println(test);
    replaceEmpty(test);
    System.out.println(test);
  }
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> out = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      out.add("" + (int)(Math.random() * 11));
      if (out.get(i).equals("0")){
        out.set(i, "");
      }
    }
    return out;
  }


public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
while (original.indexOf("") >= 0){
  original.set(original.indexOf(""), "Empty");
}
}

//public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
//}

//public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
//}
}
