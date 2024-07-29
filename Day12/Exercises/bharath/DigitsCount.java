package Day12.Exercises.bharath;
import java.util.Scanner;
public class DigitsCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value: ");
        int n=sc.nextInt();

        System.out.println("before value:");
        System.out.println(n);

        int count=0,a;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
        
        
    }
}
