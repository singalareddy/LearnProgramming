package Day10.Exercises.bharath;
import java.util.Scanner;
public class Dupliatevalues {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
             if(a[i]==a[j]){
                    System.out.println("duplicate number is "+a[i]);
                }
            }
        }
               
    }
}
