package Day06.Exercises.bharath;
import java.util.Scanner;
public class Twodigitsum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 digit number=");
        int num=input.nextInt();

        int firstdigit=num/10000;
        int seconddigit=(num/10)%10;
        int sum= firstdigit+seconddigit;
        System.out.println(sum);
    }
}
