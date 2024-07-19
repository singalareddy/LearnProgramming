package Day10.Exercises.bharath;
//import java.util.Scanner;
public class AvgoftenIntegers {
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
       // System.out.println("enter n value=");
       float sum=0;
       int num[]=new int[10];
       for(int i=11;i<20;i++){
        sum=sum+i;
       }
        float avg=sum/10;
       System.out.println("average of integers= "+avg);
    }
}
