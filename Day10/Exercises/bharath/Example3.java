package Day10.Exercises.bharath;
import java.util.Scanner;
public class Example3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter n values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0,j=i+1;i<n-1;i++,j++){
           // for(int j=i+1;j<n;j++){
               int c=a[i];
               a[i]=a[j];
               a[j]=c;
            
        }
        System.out.println("after result:");
        for(int i=0;i<n;i++){
        System.out.println(a[i]);
        }
    }
}
