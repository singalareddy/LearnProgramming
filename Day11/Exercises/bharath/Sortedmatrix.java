package Day11.Exercises.bharath;

import java.util.Arrays;
import java.util.Scanner;

public class Sortedmatrix {
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
       System.out.println("after matrix values:");
       int count=0;

       for(int i=0;i<r-1;i++){
            boolean sorted=true;
             for(int j=0;j<c-1;j++){
                if(a[i][j]>a[i][j+1]){
                    sorted=false;
                    break;
                }
             }
             if(sorted==true){
                //System.out.println("sorted");
                count++;
             }
        }
       
            System.out.println(count);
    }
}

