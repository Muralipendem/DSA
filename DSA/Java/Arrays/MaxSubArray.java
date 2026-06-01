import java.util.*;

public class MaxSubArray{
    public static void main(String[] args) {
        int[] nums={1};
        int[] result = new int[0];
        int largestSum = Integer.MIN_VALUE, window = nums.length;
        //brute force
        while(window > 0){
            int c = 0, d = nums.length - window;
            while(c <= d){
                int sum = 0;
                for(int i = c; i < (window + c); i++){
                    sum += nums[i];
                }
                if(largestSum < sum){
                    largestSum = sum;
                    result = Arrays.copyOfRange(nums, c, window + c);
                }
                c++;
            }
            window--;
        }
        System.out.println(largestSum);
        System.out.println(Arrays.toString(result));
    }
}