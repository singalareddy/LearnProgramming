package Day08.Exercises;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();

        if (year%4==0){
            System.out.println("it is leap year");
        }
        else if(year%400==0){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}
