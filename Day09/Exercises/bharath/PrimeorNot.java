package Day09.Exercises.bharath;
import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        int n=sc.nextInt();
    
    //     for(int i=2;i<=(n-1);i++){
    //         if(n%i==0){
    //             System.out.println("n is not prime number");
    //             return;
    //         }
    //     }
    //     System.out.println("n is prime"+n);
    // }   
    int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("number is prime");
          }   
        else{
            System.out.println("number is not prime");
        }   
        }

}
