package Day10.Exercises.bharath;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value=");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.printf("enter %d values",n);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int highest=Integer.MIN_VALUE;
        int secondhighest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>highest){
                secondhighest=a[i];
                highest=a[i];
            }
        }
    }
}
