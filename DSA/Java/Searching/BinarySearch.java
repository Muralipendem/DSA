
public class BinarySearch {
    public static void main(String args[]){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9,left=0,right=nums.length-1;
        int res=-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target){
                res=mid;
                break;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(res);
    }
}
