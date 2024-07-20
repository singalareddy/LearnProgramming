package Day11.Examples.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class OutsideZero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows value:");
        int r =sc.nextInt();

        System.out.println("enter column value:");
        int c =sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter matrix values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("before matrix values:");
       for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(a[i]));
       }
       System.out.println("after matrix values:");
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                if(i==0 || j==0 || i==r-1 || j==c-1){
                    a[i][j]=0;
                }
            }
         }
        System.out.println("before matrix values:");
        for(int i=0;i<r;i++){
             System.out.println(Arrays.toString(a[i]));
        }
    }

}
