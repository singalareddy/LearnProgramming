package Day10.Exercises.bharath;
import java.util.Scanner;
public class PrintSubArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        System.out.println("enter n values ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter start index value= ");
        int i1=sc.nextInt();

        System.out.println("enter end index value= ");
        int i2=sc.nextInt();
        System.out.println("array values= ");
        for(int i=i1;i<=i2;i++){
            System.out.println(a[i]);
        }

}
}