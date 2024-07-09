package Day08.Exercises.bharath;
import java.util.Scanner;
public class Minofthreenum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first value=");
        int a=input.nextInt();

        System.out.println("enter first value=");
        int b=input.nextInt();

        System.out.println("enter first value=");
        int c=input.nextInt();

        if((a<b)&&(a<c)){
            System.out.println("a is max number "+a);
        }else if(b<c){
            System.out.println("b is max number "+b);
        }else{
            System.out.println("c is max number "+c);
        }
        
    }

}
