package Day10.Examples.bharath;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 integer values");
      
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        for(int j=(b.length-1);j>=0;j--){
            b[j]=a[i];
            i++;
        }
        for(int j=0;j<b.length;j++){
       System.out.print(b[j]+", ");
        }

    }   
}
