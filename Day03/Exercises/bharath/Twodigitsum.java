
package Day03.Exercises.bharath;

public class Twodigitsum {
    public static void main(String[] args)
    {
        int num=79865;
        int firstdigit=num/10000;
        int seconddigit=(num/10)%10;
        int sum= firstdigit+seconddigit;
        System.out.println(sum);
    }
    
}
