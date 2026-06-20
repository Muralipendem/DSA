public class SplitArrayLargestSum{
    public static int check(int[] arr,int mid){
        int count=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i] <= mid){
                sum+=arr[i];
            }else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        int left=0,right=0,ans=-1;
        for(int i=0;i<nums.length;i++){
            left=Math.max(left,nums[i]);
            right+=nums[i];
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int splits = check(nums, mid);
            if(splits<=k){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(ans);
    }
}