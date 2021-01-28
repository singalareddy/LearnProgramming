import java.util.*;

public class FindInArray{

     public static void main(String []args){
         Scanner input = new Scanner(System.in);
         
          int [] a = new int[5];
         
          boolean present = false;
         
          for(int i = 0; i < a.length; i++) {
         
           a[i] = input.nextInt();//take 5 inputs from the user
         
          }
         
         System.out.println("Please enter the number you want to check: ");
         
         int number = input.nextInt();
         
         for(int i = 0; i < a.length; i++)  
         
         if(a[i] == number)
         
          present = true;
         
         System.out.println(present);

     }
}