package Day11.Examples.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixNxN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value ");
        int r=sc.nextInt();

        System.out.println("enter column value ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter values:");
        int i,j;
        for( i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
           // System.out.print(a[i][j]);
        }
        System.out.println("after mtrix formation:");
        for( i=0;i<r;i++){
            for(j=0;j<c;j++){

            }
            System.out.println(Arrays.toString(a[i]));
        }
        
      
    }
}

