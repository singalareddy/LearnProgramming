package Day09.Exercises.bharath;
import java.util.Scanner;
public class UseDoWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // String input;
       boolean input; 
        do{
            System.out.println("Enter a and b value:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println("sum of two numbers= "+sum);
            System.out.println("do u wish to continue y/n");
            sc.nextLine();
            input=sc.nextBoolean();
        }
       // while(input.equals("y") || input.equals("Y"));
        while(input==true);
    }

}
