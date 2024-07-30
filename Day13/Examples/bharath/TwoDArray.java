package Day13.Examples.bharath;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and y value: ");
        int x= sc.nextInt();
        int y=sc.nextInt();

        Array2D arr= new Array2D();
        int a[][]=arr.readtwodarray(x, y, sc);
        arr.print(a,x,y);
    }
}

class Array2D{
    public int[][] readtwodarray(int x, int y, Scanner sc){
        int a[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
    public void print(int a[][], int x, int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(a[i][j]+"  ");
           }
           System.out.println();
        }
    }
}
