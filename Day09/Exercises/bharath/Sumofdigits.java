package Day09.Exercises.bharath;
import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int value=sc.nextInt();
        int sum=0;
        while (value>0){
            int n=value%10;
            value/=10;
            sum+=n;
        }
        System.out.println(sum);
    }
}
