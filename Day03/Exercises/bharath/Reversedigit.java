package Day03.Exercises.bharath;

public class Reversedigit {
    public static void main(String[] args)
    {
        int num=258;
        int hundreds=num/100;
        int tens=(num/10)%10;
        int ones=num%10;
       int reversenum= hundreds*1+tens*10+ones*100;
       System.out.println(reversenum);
    }
    
}
