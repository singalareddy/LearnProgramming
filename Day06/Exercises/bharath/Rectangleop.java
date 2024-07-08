package Day06.Exercises.bharath;
import java.util.Scanner;
public class Rectangleop {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length=");
        int length=input.nextInt();

        System.out.println("enter breadth=");
        int breadth=input.nextInt();

        int area=length*breadth;
        int perimeter=2*(length+breadth);

        System.out.println("area of rectangle="+area+"\nperimeter of rectangle="+perimeter);
    }
}
