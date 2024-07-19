package Day10.Exercises.bharath;
import java.util.Scanner;
public class SplitArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value= ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.printf("enter %d values ",n);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter split value k= ");
        int k=sc.nextInt();
       
        int x[]=new int[k];
        int y[]=new int[n-k];

        for(int i=0;i<k;i++){
            x[i]=a[i];
            System.out.println("first array values= "+x[i]);
        }
        for(int j=k,i=0;j<n;j++,i++){
            y[i]=a[j];
            System.out.println("second array values= "+y[i]);
        }
        
        
        
    }
}

