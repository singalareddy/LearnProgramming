package Day08.Exercises.bharath;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n"+"2.Substraction\n"+"3.multiplication\n"+"4.Division");
        System.out.println("enter your choice:");
        int choice=sc.nextInt();

        System.out.println("enter first value=");
        int a = sc.nextInt();

        System.out.println("enter second value=");
        int b = sc.nextInt();
       
        if (choice==1){
           int add=a+b;
            System.out.println("Addition of two numbers=" +add);
        }
        else if(choice==2){
            int sub=a-b;
            System.out.println("Substraction of two numbers=" +sub);
        }
        else if(choice==3){
           int mul=a*b;
            System.out.println("Multiplication of two numbers=" +mul);
        }
        else if(choice==4){
            int div=a/b;
            System.out.println("Division of two numbers=" +div);
        }
        else {
            System.out.println("choice is out of range");
        }
    }
}
