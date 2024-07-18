package Day09.Exercises.bharath;
import java.util.Scanner;
public class Squares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting and ending value=");
        int start=sc.nextInt();
        int end=sc.nextInt();

        int squares;
        int i=start;
        while(i>0){
            squares=(i*i);  
            if(squares>end){
                break;
            }
            System.out.println(squares);
            i++;
        }
    }
}
