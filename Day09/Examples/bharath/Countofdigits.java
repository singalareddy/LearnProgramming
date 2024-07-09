package Day09.Examples.bharath;
import java.util.Scanner;
public class Countofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 3 digit number=");
        int num=sc.nextInt();

        while(num<1000){
           int thousandplace=num/100;
           int tensplace=(num/10)%10;
           int onesplace=num%10;

           int count=thousandplace+tensplace+onesplace;
           System.out.println(count);
           break;
        }

    }
}
