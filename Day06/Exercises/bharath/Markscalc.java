package Day06.Exercises.bharath;
import java.util.Scanner;
public class Markscalc {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter sub1 marks =" );
        float sub1=input.nextFloat();

        System.out.println("enter sub2 marks =" );
        float sub2=input.nextFloat();

        System.out.println("enter sub3 marks =" );
        float sub3=input.nextFloat();

        float totalmarks= sub1+sub2+sub3;
        float percentage=(totalmarks/300)*100;

        System.out.println("totalmarks="+totalmarks+" \npercentage="+percentage);
    }
}
