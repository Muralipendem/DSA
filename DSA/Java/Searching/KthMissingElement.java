public class KthMissingElement{
    public static void main(String[] args) {
        int[] nums={2,3,4,7,11};
        int k=5;

        //Brute force approach
        // int count=0,current=1,i=0;
        // while(count!=k){
        //     if(i<nums.length){
        //         if(current==nums[i]){
        //             current++;
        //             i++;
        //         }else{
        //             count++;
        //             current++;
        //         }
        //     }else{
        //         count++;
        //         current++;
        //     }
        // }
        // System.out.println(current-1);

        //Using Binary search method
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int missing=nums[mid]-(mid+1);
            if(missing<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(left+k);
    }
}