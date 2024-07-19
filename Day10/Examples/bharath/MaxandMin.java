package Day10.Examples.bharath;

public class MaxandMin {
    public static void main(String[] args){
        int nums[]={25, 14, 23, 15, 36, 56, 77, 18, 29, 49};
        int max=nums[0];
        int min=nums[0];

        for (int i=1;i<nums.length;i++){
        if(nums[i]>max)
        {
            max=nums[i];
            
        }
        if(nums[i]<min){
            min=nums[i];
           
        }
    }
    System.out.println(max);
    System.out.println(min);
}
}
