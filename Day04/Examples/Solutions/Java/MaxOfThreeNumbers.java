public class MaxOfTwoNumbers
{

     public static void main(String []args){
         int n1 = 25, n2 = 10, max; 
  
         System.out.println("First num: " + n1); 
         System.out.println("Second num: " + n2); 
   
         // Largest among n1 and n2 
         max = (n1 > n2) ? n1 : n2; 
   
         // Print the largest number 
         System.out.println("Maximum is = " + max); 
     }
}