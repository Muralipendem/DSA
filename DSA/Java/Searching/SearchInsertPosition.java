public class SearchInsertPosition{
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=2;
        int left=0,right=nums.length-1,res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res=mid;break;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(res!=0) System.out.println(res);
        else System.out.println(left);
    }
}