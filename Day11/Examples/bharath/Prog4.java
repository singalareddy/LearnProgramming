package Day11.Examples.bharath;

public class Prog4 {
    public static void main(String args[]){
        int[][] m = { {1,1,1,1},{1,2,3,4},{2,2,2,2},{2,4,6,8} };            
        int sum = 0;
        for (int k = 0; k < m.length; k++) {
            sum = sum + m[m.length-1-k][1];
        }
        System.out.println(sum);
    }
}
