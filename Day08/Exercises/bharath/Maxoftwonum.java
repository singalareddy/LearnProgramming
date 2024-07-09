package Day08.Exercises.bharath;
import java.util.Scanner;
public class Maxoftwonum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number=");
        int a=input.nextInt();

        System.out.println("enter first number=");
        int b=input.nextInt();

        if(a>b){
        System.out.println("a is max number " +a);
        }else{
        System.out.println("b is max number " +b);
    }
}
}
