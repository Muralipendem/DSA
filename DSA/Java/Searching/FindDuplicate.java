public class FindDuplicate{
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int left=0,right=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                right=nums[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid) count++;
            }
            if(count<=mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(left);

        //optimal one but modifing the array
        // int res=-1;
        // for(int x:nums){
        //     int ind=Math.abs(x)-1;
        //     if(nums[ind]<0){
        //         res=Math.abs(x);
        //         break;
        //     }
        //     nums[ind]=-nums[ind];
        // }
        // System.out.println(res);
    }
}