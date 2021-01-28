import java.util.*;

public class MaxAndMin{

     public static void main(String []args){
         int[] my_array = {25, 14, 23, 15, 36, 56, 77, 18, 29, 49};
         
         int max = my_array[0];
         int min = my_array[0];
         int len = my_array.length;
         
         for (int i = 1; i < len - 1; i = i + 2) {
             if (i + 1 > len) {
                 if (my_array[i] > max) 
                    max = my_array[i];
                 
                 if (my_array[i] < min) 
                    min = my_array[i];
             }
             if (my_array[i] > my_array[i + 1]) {
                 if (my_array[i] > max) 
                    max = my_array[i];
                 if (my_array[i + 1] < min) 
                    min = my_array[i + 1];
             }
             if (my_array[i] < my_array[i + 1]) {
                 if (my_array[i] < min) 
                    min = my_array[i];
                 if (my_array[i + 1] > max) 
                    max = my_array[i + 1];
             }
         }
         
         System.out.println(" Maximum value for the above array = " + max);
         System.out.println(" Minimum value for the above array = " + min);

     }
}