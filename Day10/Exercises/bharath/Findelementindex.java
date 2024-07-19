package Day10.Exercises.bharath;
import java.util.Scanner;
public class Findelementindex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n is ");
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the value to check in list");
        int checkvalue=sc.nextInt();
        boolean matchfound=false;
        for(int i=0;i<n;i++){
        if(checkvalue==a[i]){
            matchfound=true;
            System.out.println(i);
        }
        
        }
        if(matchfound==false){
        System.out.println("-1");
    }
}
}
