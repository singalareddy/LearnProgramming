package Day09.Exercises.bharath;
import java.util.Scanner;
public class Powerof {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two values=");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int power=1;

        for(int i=1;i<=b;i++){
            power*=a;
        }
        System.out.println("power of given values="+power);
    }
}
