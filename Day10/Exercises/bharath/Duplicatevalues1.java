package Day10.Exercises.bharath;
import java.util.Scanner;
public class Duplicatevalues1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value=");
        int n=sc.nextInt();

        int a[]=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.printf("enter %d value ",i);
            a[i]=sc.nextInt();

            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                System.out.println("duplicate number= "+a[i]);
            }
        }
    }
}
}
