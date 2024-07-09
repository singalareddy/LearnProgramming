package Day08.Exercises.bharath;
import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number=");
        int input=sc.nextInt();

        if (input%2==0){
            System.out.println("number is even " +input);
        }
        else{
            System.out.println("number id odd "+input);
        }
    }
}
