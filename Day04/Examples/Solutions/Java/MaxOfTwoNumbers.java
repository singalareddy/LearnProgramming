public class MaxOfTwoNumbers{

     public static void main(String []args){
         int n1 = 5, n2 = 7, n3 = 3, max; 
  
         System.out.println("First num: " + n1); 
         System.out.println("Second num: " + n2); 
         System.out.println("Third num: " + n3);
   
         // Largest among n1 and n2 
         max = ((n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3);
   
         // Print the largest number 
         System.out.println("Maximum is = " + max); 
     }
}