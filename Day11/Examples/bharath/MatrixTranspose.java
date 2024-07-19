package Day11.Examples.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value:");
        int r=sc.nextInt();

        System.out.println("enter column value:");
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter value:"); //to enter user input values for matrix formation.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        } 
        System.out.println("before transpose of matrix:");
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(a[i]));
        }

        System.out.println("after transpose of matrix:");
        int trans[][]=new int[r][c];        //method execution
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    trans[i][j]=a[i][j];
                }
                else{
                    trans[i][j]=a[j][i];
                }
              
                //System.out.print(trans[i][j]+" ");
            }
           // System.out.println();
        }
        for(int i=0;i<r;i++){
        System.out.println(Arrays.toString(trans[i]));
        }
    }
}
