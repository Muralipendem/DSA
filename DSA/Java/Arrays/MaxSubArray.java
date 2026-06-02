import java.util.*;

public class MaxSubArray{
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
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
        //optimal approach using kadane's algorithm
        int CurrentSum=nums[0], maxs=nums[0];
        for(int i=1;i<nums.length;i++){
            CurrentSum=Math.max(nums[i],CurrentSum+nums[i]);
            maxs = Math.max(maxs,CurrentSum);
        }
        System.out.println(maxs);

    }
}