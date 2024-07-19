package Day10.Exercises.bharath;
import java.util.Scanner;
public class CommonElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter first interger value= ");
    int x=sc.nextInt();

    System.out.println("enter second interger value= ");
    int y=sc.nextInt();
    
    int a[]=new int[x];
    int b[]=new int[y];

    System.out.println("enter x digit values= ");
    for(int i=0;i<x;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter y digit values= ");
    for(int i=0;i<x;i++){
        b[i]=sc.nextInt();
    }
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            if(a[i]==b[j]){
                System.out.println("common elements= "+a[i]);
        }
    }
    

    }
}
}
