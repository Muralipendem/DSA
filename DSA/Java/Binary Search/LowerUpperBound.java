
import java.util.Arrays;


public class LowerUpperBound{
    public static void main(String args[]){
        int nums[]={2};
        int target=2;
        int x = lowerBound(nums, target);
        int y = UpperBound(nums, target);
        int res[]={x,y};
        System.out.println(Arrays.toString(res));
    }
    //lower bound for first elements
    public static int lowerBound(int nums[], int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    //Upper bound for Last elements
    public static int UpperBound(int nums[], int target){
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left=mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}