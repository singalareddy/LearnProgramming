package Day09.Exercises.bharath;
import java.util.Scanner;
public class Star6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row value");
        int row=sc.nextInt();
       // int column=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)                               
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(row-i);k++){
                 System.out.print("*");  
            }
            System.out.println();
            }
        }   
    }