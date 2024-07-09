package Day09.Examples.bharath;
import java.util.Scanner;
public class TablesWHILE {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value=");
        int table =sc.nextInt();
        int i;
        while (i<=10){
            System.out.println(table+"*"+i+"="+table*i);
            i++;
        }

        }
    }

