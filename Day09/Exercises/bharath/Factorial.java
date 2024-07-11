package Day09.Exercises.bharath;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        int n=sc.nextInt();

        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
            System.out.println("Factorial of given value="+fact);
            
        }
       
        
    }

