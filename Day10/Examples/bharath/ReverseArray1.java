package Day10.Examples.bharath;
import java.util.Scanner;
public class ReverseArray1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n values");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter k value= ");
        int k=sc.nextInt();

        int i=k-1;
        for(int j=0;j<k;j++){
            b[j]=a[i];
            i--;
        }
         i=k;
        for(int j=k;j<=b.length-1;j++){
          b[j]=a[i];
            i++;
        }
        System.out.println("Reversed numbers ");
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }
}
