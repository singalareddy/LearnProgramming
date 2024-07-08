package Day06.Exercises.bharath;
import java.util.Scanner;
public class Celciusconvert {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter farhenheit value=");
        float value=input.nextFloat();

        float celcius=(value-32)*5/9;
        System.out.println(celcius);
    }
}
