package Day11.Examples.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value ");
        int r=sc.nextInt();

        System.out.println("enter column value ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        int b[][]=new int[r][c];

        System.out.println("enter first matrix values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("after matrix addition:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
           // System.out.println(Arrays.toString(sum[i][j]));
        }
       
    }
}

