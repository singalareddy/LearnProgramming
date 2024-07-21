package Day11.Exercises.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class SnakeMatrix {
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
       int b[][]=new int[r][c];
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i%2==0){
                    b[i][j]=a[i][j];
                }
                else if(i%2!=0){
                    b[i][j]=a[i][c-j-1];
                }
            }

       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(b[i][j]+" ");
        }
    }
    }  
}
