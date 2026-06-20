public class FindSingleElement{
    public static void main(String[] args) {
        int[] nums={1,2,2};
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int idx=mid;
            if(mid-1>=0){
                if(nums[mid]==nums[mid-1]) idx=mid;
            }
            if(mid+1<nums.length){
                if(nums[mid]==nums[mid+1]) idx=mid+1;
            }
            if((idx+1)%2==0) left=mid+1;
            else right=mid-1;
        }
        System.out.println(nums[left]);
    }
}