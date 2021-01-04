import java.util.Scanner;

public class UsingScannerNext{

     public static void main(String []args){
         // creates an object of Scanner
         Scanner input = new Scanner(System.in);
     
         System.out.print("Enter your first & last name by space seperated: ");
         String firstName = input.next();
         System.out.println("First Name : " + firstName);
         String lastName = input.next();
         System.out.println("Last Name : " + lastName);
     }
}