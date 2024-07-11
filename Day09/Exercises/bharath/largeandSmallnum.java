package Day09.Exercises.bharath;
import java.util.Scanner;
public class largeandSmallnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many values to read=");
        int input=sc.nextInt();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=input;i++){
            int value=sc.nextInt();

            if(value>max)
            {
                max=value;
                
            }
            if(value<min){
                min=value;
               
            }
        }
        System.out.println("max num is "+max);
        System.out.println("min num is "+min);
    }
}
