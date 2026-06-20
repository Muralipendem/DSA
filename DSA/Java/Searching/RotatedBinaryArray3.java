public class RotatedBinaryArray3{
    public static void main(String[] args) {
        //tricky problem try to understand
        int[] nums={2,1};// first->[4,5,6,7], second->[0,1,2]
        int left=0, right=nums.length-1;
        while(left<right){
            int mid = left+(right - left)/2;
            if(nums[left]<=nums[mid]){
                if(nums[mid]<=nums[right]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<=nums[right]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }
        }
        System.out.println(nums[left]);
    }
}