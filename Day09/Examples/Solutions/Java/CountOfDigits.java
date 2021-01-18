public class CountOfDigits{

     public static void main(String []args){
         int num = 1233, digitsCount = 0;
         while(num > 0)
         {
            num /= 10;
            digitsCount++;
         }
         System.out.println("Count of digits = "+ digitsCount);
     }
}