package Day12.Exercises.bharath;

import java.util.Scanner;

public class CommonElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value");
        int x=sc.nextInt();
        System.out.println("enter y values");
        int y=sc.nextInt();
        int a[]= new int[x];
        int b[]= new int[y];

        System.out.println("enter a values");
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter b values");
        for(int i=0;i<y;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("enter result: ");
        int count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
            {
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    count++;
                    //System.out.println(count);
                }
            }
        }
        System.out.println("count= "+count);
}
}
