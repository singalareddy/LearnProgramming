package Day10.Exercises.bharath;
import java.util.Scanner;
public class Example2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1 value= ");
        int n1=sc.nextInt();

        System.out.println("enter n2 value= ");
        int n2=sc.nextInt();
        int m=n1+n2;

        int a[]=new int[n1];
        int b[]=new int[n2];
        int c[]=new int[m];

        System.out.println("enter n1 values");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter n2 values");
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("combined array results:");
    
    for(int i=0,j=0;i<n1;i++,j++){
        c[j]=a[i];
       System.out.print(c[j]+" ");
    }
    for(int i=0,j=0;i<n2;i++,j++){
        c[j]=b[i];
    
    System.out.print(c[j]+" ");
    }
}
}
