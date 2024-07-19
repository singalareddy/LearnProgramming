package Day10.Exercises.bharath;
import java.util.Scanner;
public class Example1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter n values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int num=0;
        System.out.println("result:");
        for(int i=0;i<n;i++){
            num=num*10+a[i];
        }
        System.out.println(num);
        }
    }

