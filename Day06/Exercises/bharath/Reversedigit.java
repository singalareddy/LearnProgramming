package Day06.Exercises.bharath;
import java.util.Scanner;
public class Reversedigit {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 3 digit number=");
        int num=input.nextInt();

        int hundreds=num/100;
        int tens=(num/10)%10;
        int ones=num%10;
       int reversenum= hundreds*1+tens*10+ones*100;
       System.out.println(reversenum);
    }

}
