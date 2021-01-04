import java.util.Scanner;

public class ScannerInputs{

     public static void main(String []args){
         // creates an object of Scanner
         Scanner input = new Scanner(System.in);
     
         System.out.println("Enter an integer: ");
         // reads an int value
         int dataInt = input.nextInt();
         System.out.println("Using nextInt(): " + dataInt);
         
         System.out.println("Enter float value: ");
         // reads an float value
         float dataFloat = input.nextFloat();
         System.out.println("Using nextFloat(): " + dataFloat);
         
         System.out.println("Enter boolean: ");
         // reads an boolean value
         boolean dataBoolean = input.nextBoolean();
         System.out.println("Using nextBoolean(): " + dataBoolean);
         
         System.out.print("Enter your name: ");
         // reads the entire word
         String dataWord = input.next();
         System.out.println("Using next(): " + dataWord);
         input.nextLine();
         
         System.out.print("Enter your name: ");
         // reads the entire line
         String dataLine = input.nextLine();
         System.out.println("Using nextLine(): " + dataLine);
         
         System.out.println("Enter Byte: ");
         // reads an int value
         byte dataByte = input.nextByte();
         System.out.println("Using nextByte(): " + dataByte);
         
         System.out.print("Enter Double value: ");
         // reads the double value
         double dataDouble = input.nextDouble();
         System.out.println("Using nextDouble(): " + dataDouble);

         System.out.print("Enter Short value: ");
         // reads the Short value
         short dataShort = input.nextShort();
         System.out.println("Using nextShort(): " + dataShort);
         
         System.out.print("Enter Long value: ");
         // reads the Long value
         long dataLong = input.nextLong();
         System.out.println("Using nextLong(): " + dataLong);
         
     }
}