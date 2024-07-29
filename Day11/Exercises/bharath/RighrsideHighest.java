package Day11.Exercises.bharath;
import java.util.Scanner;
public class RighrsideHighest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();

        System.out.println("enter n values:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("after entering values:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    
        for(int i=0;i<n;i++){
           boolean  istrue=true;
            for(int j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    istrue=false;
                    break;
                }
            }
        
            if(istrue==true)
              {
                System.out.print(a[i]+" ");             
              }

        }
        

    }
        
}

   
