package Day12.Exercises.bharath;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string:");
        String a=sc.nextLine();

        System.out.println("enter second string:");
        String b=sc.nextLine();


        System.out.println("before string:");
        System.out.println(a);
        System.out.println(b);

        char ch1[]= a.toCharArray();
        char ch2[]= b.toCharArray();

        Arrays.sort(ch1);   
        Arrays.sort(ch2);    
        
        System.out.println(ch1);
        System.out.println(ch2);

       
        if( Arrays.equals(ch1, ch2)
        ){
            System.out.println("it is Anagram");
        }
        else{
            System.out.println("it is not anagram");
        }

      
    }
}
