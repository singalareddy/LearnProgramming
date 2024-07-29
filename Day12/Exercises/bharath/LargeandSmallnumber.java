package Day12.Exercises.bharath;

import java.util.Scanner;

public class LargeandSmallnumber {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value= ");
        int n=sc.nextInt();
        System.out.println("enter n values: ");
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                {
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        System.out.println("after result: ");
        for(int i=0;i<n;i++){
        System.out.println(a[i]);
        }
        System.out.println("highest element= "+a[n-1]);
        System.out.println("lowest element= "+a[0]);
    }
}

