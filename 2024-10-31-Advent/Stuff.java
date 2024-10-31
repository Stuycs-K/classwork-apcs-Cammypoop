import java.util.Scanner;
public class Stuff{
    public static void main(String[] args){
        Scanner sc = new Scanner("Test\n God has\nGiven");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}