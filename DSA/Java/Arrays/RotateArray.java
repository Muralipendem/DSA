
import java.util.Arrays;

public class RotateArray{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=4;
        int repeats= k % (nums.length);
        int l=0, r=nums.length -1;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
        System.out.println(Arrays.toString(nums));
        l=0;r=repeats-1;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
        System.out.println(Arrays.toString(nums));
        l=repeats;r=nums.length -1;
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;r--;
        }
        System.out.println(Arrays.toString(nums));
    }
}