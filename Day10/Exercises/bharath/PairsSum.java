package Day10.Exercises.bharath;
import java.util.Scanner;
public class PairsSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter n values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter SUM value= ");
        int sum=sc.nextInt();

        for(int i=0;i<n-1;i++){
            if(a[i]+a[i+1]==sum){
                System.out.println(a[i]+","+a[i+1]);
            }
        }
    }
}
