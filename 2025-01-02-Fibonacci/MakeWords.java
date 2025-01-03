public class MakeWords{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for (int i = 0; i < alphabet.length(); i++){
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }
    }
  }
  public static void main(String[] args) {
    int remainingLetters = Integer.parseInt(args[0]);
    String alphabet = args[1];
    // String result = args[2];
    makeWords(remainingLetters, "", alphabet);
  }
}
