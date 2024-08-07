package Day13.Examples.bharath;
import java.util.Scanner;
public class Choice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int count=0;
        while(true){
        System.out.println("1.Insert element\n"+"2.Delete end element\n"+"3.Update at any Index\n"+"4.Print all elements\n"+"5.Exit");
        System.out.println("select choice:");
        int choice =sc.nextInt();
        
        if(choice==1){
            System.out.println("enter element:");
            int element=sc.nextInt();
                a[count]=element;
                count++;
        }
        
        if(choice==2){
            a[count-1]=0;
            count--;
        }

        if(choice==3){
            System.out.println("enter index place:");
            int index=sc.nextInt();
            System.out.println("enter element:");
            int element=sc.nextInt();
            if(index<count){
                a[index]=element;
            }
            else{
                System.out.println("\"check index value\"");
            }
        }
        if(choice==4){
            for(int i=0;i<count;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        if(choice==5){
            return;
        }
    }
        
    }
}
