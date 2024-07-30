package Day12.Exercises.bharath;
import java.util.Scanner;
public class ProductofOtherElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        int n=sc.nextInt();
        System.out.println("enter n values: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("after result");
        
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    sum=sum*a[j];
                }
               
            }
            b[i]=sum;
            System.out.println(b[i]);
        }
    }
}
