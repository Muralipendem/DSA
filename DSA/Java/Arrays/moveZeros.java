public class moveZeros{
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};   //[1,3,12,0,0]
        int r=0,l=0;
        while(r<nums.length){
            if(nums[r]!=0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r++;l++;
            }
            else r++;
        }
        for(Integer a:nums){
            System.out.print(a+"-->");
        }
    }
}