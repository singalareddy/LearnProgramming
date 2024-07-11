package Day09.Exercises.bharath;
import java.util.Scanner;
public class Reversedigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value=");
        int value=sc.nextInt();

        int reverse=0;
            while(value>0){
                int n=value%10;
                reverse=(reverse*10)+n;
                value=value/10;
               
            }
            System.out.println(reverse);
       
        }
}
