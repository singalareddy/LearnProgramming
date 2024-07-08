package Day06.Exercises.bharath;
import java.util.Scanner;
public class Digitssum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 3 digit value=");
        int value = input.nextInt();

        int firstdigit= value/100;
        int seconddigit=(value/10)%10;
        int thirddigit=value%10;
        int digitsum=firstdigit+seconddigit+thirddigit;
        System.out.println(digitsum);
        
    }
}
