package Day09.Examples.bharath;
import java.util.Scanner;
public class TablesFOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which table");
        int table=sc.nextInt();

        for(int i=1;i<=10;i++){
          // for(int j=1;j<=10;j++)
            System.out.println(table+"*"+i+"="+table*i);
        }
    }
}
