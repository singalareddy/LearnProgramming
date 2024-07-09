package Day08.Examples.bharath;
import java.util.Scanner;
public class Printpositiveornegativenum {
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int input=sc.nextInt();

    if(input<0){
        System.out.println("number is NEGATIVE");
    }
    else if(input>0){
        System.out.println("number is POSITIVE");
    }
    else{
        System.out.println("number is ZERO");
    }
}

}
