package Day03.Examples.bharath;

public class Swaptwovalues {
    public static void main(String[] args)
    {
        int a=5, b=8,c;//with third variable
        c=a;
        a=b;
        b=c;
       System.out.println("a="+a+" b="+b);
       System.out.printf("a=%d b=%d",a,b);
       //without third variable
        b=b-a;//b=8-5=3
        a=a+b;//a=5+3=8
        b=a-b;//b=8-3=5
        System.out.println("a="+a+" b="+b);
    }
    
}
