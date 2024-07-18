package Day09.Exercises.bharath;
import java.util.Scanner;
public class Countofpositiveandnegativenum{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter how many values=");
            int count=sc.nextInt();

            int positivenum=0;
            int negativenum=0;
            int zeronum=0;

            for(int i=1;i<=count;i++){
                int value=sc.nextInt();

            if (value>0){
                positivenum +=1;
            }
            else if(value<0){
                negativenum ++;
            }
            else
                zeronum ++;
            }
            System.out.println(positivenum);
            System.out.println(negativenum);
            System.out.println(zeronum);
    
    
        }
}