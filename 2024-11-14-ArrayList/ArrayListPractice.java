public class ArrayListPractice{
  public static void main(String[] args) {
    System.out.println()
  }
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> out = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      ArrayList.add((int)(Math.random() * 11) + "");
      if out.get(i).equals("0"){
        out.set(i, "");
      }
    }
    return out;
  }
}
