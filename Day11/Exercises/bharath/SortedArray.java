package Day11.Exercises.bharath;
import java.util.Scanner;
public class SortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();

        System.out.println("enter n values:");
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int count=0,sum=0;
       boolean sorted=true;
       for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                sorted=false;
                break;
             }
             //System.out.println("sorted");
        }
        
        if(sorted==false){
            System.out.println("not sorted");
            count++;
            System.out.println(count);
        }
        else{
            System.out.println("sorted");
            sum++;
            System.out.println(sum);
        }
    }
}

