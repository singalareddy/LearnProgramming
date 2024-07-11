package Day09.Exercises.bharath;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two values=");
        int a=sc.nextInt();
        int b=sc.nextInt();

      // int remainder=0;
      while(true){
      int remainder=a%b;
      
        if(remainder==0){
            System.out.println("HCF of two values "+b);
            break;
        }
        a=b;
        b=remainder;
    }
}

}
