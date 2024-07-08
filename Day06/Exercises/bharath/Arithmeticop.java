package Day06.Exercises.bharath;
import java.util.Scanner;
public class Arithmeticop {
    public static void main(String[] args)
    {
Scanner input=new Scanner(System.in);
System.out.println("enter a value=");
int a=input.nextInt();

System.out.println("enter b value=");
int b=input.nextInt();

int sum=a+b;
int sub=a-b;
int div=a/b;
int multi=a*b;
System.out.printf("sum=%d\n sub=%d\n div=%d\n multi=%d",sum,sub,div,multi);
    }
    
}
