package Day12.Exercises.bharath;
import java.util.Scanner;
import java.util.Arrays;
public class Repitition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String s=sc.nextLine();

        System.out.println("before string:");
        System.out.println(s);

        // char ch[]=new char[s.length()];
        //     for(int i=0;i<s.length();i++){
        //         ch[i]=s.charAt(i);
           //  }
       // System.out.println(Arrays.toString());
        //to count repetition of characters
            
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    continue;
                }
            int count=1;
            for(int j=i+1;j<s.length();j++){
                 if(s.charAt(i)==s.charAt(j)){
                   //s(j)=' ';
                   
                    count+=1;
                }
            }
            
            System.out.printf("occurance of %c is: %d\n",s.charAt(i),count);
            s = s.replace(s.charAt(i),' ');
        }
    }
}
