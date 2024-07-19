package Day10.Exercises;
import java.util.Scanner;
public class CompareFloatArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1 value= ");
        int n1=sc.nextInt();

        System.out.println("enter n2 value= ");
        int n2=sc.nextInt();

        if(n1!=n2){
            System.out.println("array size not equal!");
            return;
        }

        float a[]=new float[n1];
        float b[]=new float[n2];

        System.out.println("enter n1 values");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextFloat();
        }

        System.out.println("enter n2 values");
        for(int j=0;j<n2;j++){
            b[j]=sc.nextFloat();
        }
        for(int i=0;i<n1;i++){
            if(a[i]!=b[i]){
                System.out.println("both Float arrays are not same!");
                return;
            }
        }
        System.out.println("both Float arrays are same!");

    }
}
