package Day10.Exercises.bharath;
import java.util.Scanner;
public class Example4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter n values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("output:");
        for(int i=n-1;i>=0;i--){
            if(a[n-1]<a[i]){
                System.out.print(a[i]+" ");
            }
        }
    }
}
