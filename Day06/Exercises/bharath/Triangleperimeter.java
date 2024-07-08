package Day06.Exercises.bharath;
import java.util.Scanner;
public class Triangleperimeter {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first side value=");
        int side1=input.nextInt();

        System.out.println("enter second side value=");
        int side2=input.nextInt();

        System.out.println("enter third side value=");
        int side3=input.nextInt();

        int perimeter=side1+side2+side3;
        System.out.println("perimeter of triangle is=" +perimeter);    }
}
