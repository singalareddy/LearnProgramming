package Day11.Exercises.bharath;

import java.util.Arrays;
import java.util.Scanner;

public class HighestnumMatrix {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value");
        int r =sc.nextInt();
        System.out.println("enter column value");
        int c =sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter matrix value");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
         System.out.println("before matrix values:");
       for(int i=0;i<r;i++){                                //to print A matrix values
            System.out.println(Arrays.toString(a[i]));
        }
        int val[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c-1;j++){
                for(int k=j+1;k<c;k++)
                    if(a[i][j]<a[i][k])
                {
                 val[i][j]=a[i][j];
                 a[i][j]=a[i][k];
                 a[i][k]=val[i][j];
                }
            }
        }
        
        for(int i=0;i<r;i++){
         //   for(int j=0;j<c;j++){
        System.out.print("Highest= "+a[i][0]);
        System.out.println();
    }
}
}
        
    


