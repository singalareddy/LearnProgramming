package Day13.Examples.bharath;
import java.util.Scanner;
public class IndextoLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter n value");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.printf("enter %d values\n",n);
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
        System.out.println("enter index to push element to last");
        int index=sc.nextInt();
        int last=a[index];
        for(int i=index;i<n-1;i++){
            a[index]=a[index+1];
            index++;
        }
        a[n-1]=last;
        System.out.println("after result:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
      }
}
