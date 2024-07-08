package Day06.Exercises.bharath;
import java.util.Scanner;
public class Swaptwovalues {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a value=");
        int a= input.nextInt();

        System.out.println("enter b value=");
        int b=input.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.printf("a=%d b=%d",a,b);
    }
}
