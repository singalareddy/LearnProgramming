package Day03.Examples.bharath;

public class Digitssum {
    public static void main(String[] args)
    {
        int num= 525;
        int first = num/100;
        int second = (num/10)%10;
        int third = num%10;
        int sum = first+second+third;
        System.out.println(sum);
    }
    
}
