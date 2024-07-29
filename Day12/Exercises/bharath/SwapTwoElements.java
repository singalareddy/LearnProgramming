package Day12.Exercises.bharath;

import java.util.Scanner;

public class SwapTwoElements {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value: ");
        int a=sc.nextInt();
        
        System.out.println("enter b value: ");
        int b=sc.nextInt();

        System.out.printf("a : %d\n",a);
        System.out.printf("b : %d\n",b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:");
        System.out.printf("a : %d\n",a);
        System.out.printf("b : %d",b);
}
}
