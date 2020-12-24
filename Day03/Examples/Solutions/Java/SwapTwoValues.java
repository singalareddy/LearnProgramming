public class SwapTwoValues{

     public static void main(String []args){
        int x = 3;
        int y = 8;
        int z;
        System.out.println("Before swap\t  x = "+ x + " y= "+ y);
        //using third variable
        z = x;
        x = y;
        y = z;
        
        System.out.println("After first  swap x = "+ x + " y= "+ y);
        //without using third variable
        y = y-x;
        x = y+x;
        y = -(y-x);
        System.out.println("After second swap x = "+ x + " y= "+ y);

     }
}