package Day13.Examples.bharath;
import java.util.Scanner;
public class Array2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m value");
        int m=sc.nextInt();
        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[]=new int[m*n];
        int count =0;
        for(int i=0;i<m*n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
           // count;
            for(int j=0;j<n;j++){
                System.out.print(a[count]+" ");
                count++;
            }
            System.out.println();
        }
        

    }
}
