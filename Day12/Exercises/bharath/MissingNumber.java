package Day12.Exercises.bharath;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n values");
        int n=sc.nextInt();
        int a[]= new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int nn=n*(n+1)/2;
        System.out.println("nn value= "+nn);
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=a[i];
        }
                System.out.println(sum-nn);
            

    

}
}
