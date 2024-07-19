package Day10.Exercises.bharath;
import java.util.Scanner;
public class Printoddposition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.printf("enter %d values:\n",n);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i+=2){
            System.out.println(a[i]);
        }
    }
}
