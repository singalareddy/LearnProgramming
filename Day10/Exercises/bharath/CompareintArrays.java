package Day10.Exercises.bharath;
import java.util.Scanner;
public class CompareintArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1 value= ");
        int n1=sc.nextInt();
        System.out.println("enter n2 value=");
        int n2=sc.nextInt();

        if(n1!=n2){
            System.out.println("Array size not matched!");
            return;
        }

        int a[]=new int[n1];
        int b[]=new int[n2];
        System.out.println("enter n1 values:");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter n2 values:");
        for(int j=0;j<n2;j++){
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n1;i++){
        if(a[i]!=b[i]){
            System.out.println("both arrays are not same");
            return;
        }
    }
    System.out.println("both arrays are same");
    }
}
