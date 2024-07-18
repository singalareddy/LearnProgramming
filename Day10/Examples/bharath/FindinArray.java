package Day10.Examples.bharath;
import java.util.Scanner;
public class FindinArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 values");
       

        int num[]=new int[5];

        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("enter the value to check in list");
        int checkvalue=sc.nextInt();
        boolean matchFound = false;

        for(int i=0;i<num.length;i++){
            if(checkvalue==num[i]){
                matchFound = true;
                //System.out.println("number is in the list");
                break;
            }
            }

            if(matchFound)
                System.out.println("number is in the list");
            else
                System.out.println("number is not in the list");
}
}
