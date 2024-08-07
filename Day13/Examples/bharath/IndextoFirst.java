package Day13.Examples.bharath;

import java.util.Scanner;
public class IndextoFirst {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.printf("enter %d values\n",n);
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        System.out.println("enter index to push element to first");
        int index=sc.nextInt();
        int first=a[index];
        for(int i=index;i>0;i--){
            a[index]=a[index-1];
            index--;
        }
        a[0]=first;
        System.out.println("after result:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
      }
}
