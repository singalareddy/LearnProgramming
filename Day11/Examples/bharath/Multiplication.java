package Day11.Examples.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A matrix row and column value:");
        int m =sc.nextInt();
        int n=sc.nextInt();

        System.out.println("enter B matrix row and column value:");
        int m1=sc.nextInt();
        int n1=sc.nextInt();

        int a[][]=new int[m][n];                     //A=m:n & B=m1:n1
        int b[][]=new int[m1][n1];                  //output=m:n1 (if n==m1)

        if(n!=m1){
            System.out.println("matrix multiplication is not possible due to different row and column size");
            return;
        }

        System.out.println("enter A matrix values:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter B matrix values:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                b[i][j]=sc.nextInt();
            }
        }
         System.out.println("before matrix values:");
       for(int i=0;i<m;i++){                                //to print A matrix values
            System.out.println(Arrays.toString(a[i]));
           
       }
       for(int i=0;i<n;i++){                                //to print B matrix values
       System.out.println(Arrays.toString(b[i]));
       }
       System.out.println("after matrix values:");
        int res[][]= new int[m][n1];
       for(int i=0;i<m;i++){                                   //A=m:n & B=m1:n1
            for(int j=0;j<n1;j++){                            //output=m:n1 (if n==m1)
                for(int k=0;k<n;k++){
                   res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n1;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
