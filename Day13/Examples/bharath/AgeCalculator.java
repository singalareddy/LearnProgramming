package Day13.Examples.bharath;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bithyear: ");
        int by=sc.nextInt();

        age now=new age();      //object for class-age
        int cal=now.myage(by);
        System.out.println(cal);
    }
}
class age{
    public int myage(int birthyear){
        int presentyear=2024;
        int presentage=presentyear-birthyear;
        return presentage;
    }

}
