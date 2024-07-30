package Day13.Examples.bharath;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value to do factorial:");
        int n=sc.nextInt();

        fact f=new fact();      //object for class-fact
        int fac=f.factorial(n);
        System.out.println(fac);
    }
}
class fact{
    public int  factorial(int n){
        int facto=1;
        for(int i=n;i>0;i--){
            facto*=i;
        }
        return facto;
    }
}