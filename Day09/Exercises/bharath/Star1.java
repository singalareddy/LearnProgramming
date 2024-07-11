package Day09.Exercises.bharath;
import java.util.Scanner;
public class Star1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and column value=");
        int row=sc.nextInt();
        int column=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");
            }
       System.out.println();
        }
    }
}
