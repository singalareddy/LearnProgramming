package Day06.Exercises.bharath;
import java.util.Scanner;
public class maxoftwonum {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
        System.out.println("enter first value=");
        int a=input.nextInt();

        System.out.println("enter first value=");
        int b=input.nextInt();

        int max=a>b?a:b;
        System.out.println("max value of two digits="+max);



    }
}
