package Day08.Exercises.bharath;
import java.util.Scanner;
public class Calculatorwithswitch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n"+"2.Substraction\n"+"3.multiplication\n"+"4.Division");
        System.out.println("enter your choice=");
        int choice=sc.nextInt();

        System.out.println("enter first value=");
        int a = sc.nextInt();

        System.out.println("enter second value=");
        int b = sc.nextInt();

        switch(choice){
            case 1: int add=a+b;
            System.out.println("Addition of two numers="+add); break;

            case 2: int sub=a-b;
            System.out.println("Substraction of two numers="+sub); break;

            case 3: int mul=a-b;
            System.out.println("multiplication of two numers="+mul); break;

            case 4: int div=a-b;
            System.out.println("Division of two numers="+div); break;
            
            default : System.out.println("choice is out of range");
        }
    }
}
