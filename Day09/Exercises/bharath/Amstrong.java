package Day09.Exercises.bharath;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        //int value=sc.nextInt();

for(int i= 1; i<=500; i++){
        int sum=0;
        int value = i;
        while(value>0){
            int n=value%10;
            value/=10;
           sum+=n*n*n;
        } 
            if(sum==i){
            System.out.println("Given number is Amstrong "+sum);
            }
            //  else{
            // System.out.println("Given number is not Amstrong "+sum);
            // }    
}
    }
}