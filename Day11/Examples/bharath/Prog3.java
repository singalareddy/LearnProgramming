package Day11.Examples.bharath;

import java.util.Arrays;

public class Prog3 {
    public static void main(String args[]){
         int [][] mat = new int [4][3];
            for (int row = 0; row < mat.length; row++) {
               for (int col = 0; col < mat[0].length; col++) {
                  if (row < col)
                     mat[row][col] = 1;
                  else if (row == col)
                     mat[row][col] = 2;
                  else
                     mat[row][col] = 3; 
                   
               } 
            }
            System.out.println(Arrays.toString(mat[0]));
            System.out.println(Arrays.toString(mat[1]));
            System.out.println(Arrays.toString(mat[2]));
            System.out.println(Arrays.toString(mat[3]));
    }
}
