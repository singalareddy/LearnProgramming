package Day06.Exercises.bharath;
import java.util.Scanner;
public class Maxofthreedigits {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("enter first value=");
    int a=input.nextInt();

    System.out.println("enter second value=");
    int b=input.nextInt();

    System.out.println("enter third value=");
    int c=input.nextInt();

    int max=((a>b)?(a>c)?a:c:(b>c)?b:c);
    System.out.println("max of three digits="+max);

    }
}
