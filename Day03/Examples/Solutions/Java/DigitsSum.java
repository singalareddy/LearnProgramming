public class DigitsSum{

     public static void main(String []args){

        int n, first, second, third, sum;
        /*finding the digits of the entered number n*/
        n = 525;
        first = n/100;     //first digit
        n = n%100;
	    
        second = n/10;     //second digit
        
        third = n%10;      //third digit
	    
        /*reverse number */
        sum = first + second + third;
        System.out.println("Sum of digits in a 3 digit number : "+sum);

     }
}