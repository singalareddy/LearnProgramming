package Day10.Exercises.bharath;
import java.util.Scanner;

public class CompareBoolArrays {
    
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

        boolean a[]=new boolean[n1];
        boolean b[]=new boolean[n2];

        System.out.println("enter n1 values");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextBoolean();
        }

        System.out.println("enter n2 values");
        for(int j=0;j<n2;j++){
            b[j]=sc.nextBoolean();
        }
        for(int i=0;i<n1;i++){
            if(a[i]!=b[i]){
                System.out.println("both boolean arrays are not same!");
                return;
            }
        }
        System.out.println("both boolean arrays are same!");
    }
}
