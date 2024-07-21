package Day11.Exercises.bharath;
import java.util.Arrays;
import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value");
        int r =sc.nextInt();
        System.out.println("enter column value");
        int c =sc.nextInt();

        if(r!=c){
            System.out.println("both values not equal");
            System.out.println("to check symmetry rows and columns should be equal");
        }

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
       int i,j;
       for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i==j){
                     b[i][j]=a[i][j];
                }
                else{
                    b[i][j]=a[j][i];
                }
                     System.out.print(b[i][j]+" ");
            }
                   System.out.println();
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                 if(a[i][j]!=b[i][j]){
                    System.out.println("not symmetrix");
                    return;
                     }
                // else{
                // System.out.println("symmetrix");
                // return;
                // }
            }
        }
        System.out.println("symmetrix");
    
    }
}
        
       
              
            
        
    
    
    