package Day13.Examples.bharath;
import java.util.Scanner;
public class OneDArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        Array x=new Array();            //object for class Array
        int a[]=x.readArray(n, sc);     //function calling
       // System.out.println(a);
        x.print(a);
    }
}
class Array{
    public int[] readArray(int size, Scanner sc)
    {
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
    public void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
