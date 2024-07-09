package Day08.Examples.bharath;
import java.util.Scanner;
public class Printpositive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter positive number=");
        int input=sc.nextInt();

        if(input>0){
            System.out.println("my name is bharath reddy");
        }
        else{
            System.out.println("number is not positive");
        }
    }
}
