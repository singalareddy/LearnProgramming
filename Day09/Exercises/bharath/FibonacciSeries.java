package Day09.Exercises.bharath;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value=");
        int n=sc.nextInt();
     
        int a=0,b=1,i=3;
        while(i<=n){
            int Fibonacci=a+b;
            System.out.print(Fibonacci+", ");
            a=b;
            b=Fibonacci;
            // if(i>=n){
            //     break;
            // }
            i++;
        // System.out.println("Fibonacci Series:");
        // int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
        // for (int i = 3; i <= n; i++) {
        //     int next = a + b;
        //     System.out.print(next + " ");
        //     a = b;
        //     b = next; 
       
        }
    }
}
