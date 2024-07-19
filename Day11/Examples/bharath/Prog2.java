package Day11.Examples.bharath;

public class Prog2 {
    public static void main(String args[]){
        int[][] matrix = { {1,1,2,2},{1,2,2,4},{1,2,3,4},{1,4,1,2} };
        int sum = 0;
        int col = matrix[0].length - 2;
        for (int row = 0; row < 4; row++)
        {
           sum = sum + matrix[row][col];
        }            
        System.out.println(sum);

    }
}
