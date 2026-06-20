public class RotatedBinaryArray2{
    public static void main(String[] args) {
        //tricky problem try to understand
        int[] nums={1,0,1,1,1};// first->[4,5,6,7], second->[0,1,2]
        int target=0;
        int left=0, right=nums.length-1,ans=-1;
        while(left<=right){
            int mid = left+(right - left)/2;
            if(nums[mid]==target){ans=mid;break;}
            //it is check for first part
            if(nums[left]==nums[mid] &&left+1<nums.length) left++;
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<=nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            //it is check for second part
            }else{
                if(nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        System.out.println(ans);
    }
}