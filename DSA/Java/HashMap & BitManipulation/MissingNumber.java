public class MissingNumber{
    public static void main(String args[]){
        int[] nums={0,1,2,3,4,5,7,8,9};
        // Using HashMaps
        // HashMap<Integer,Boolean> mp=new HashMap<>();
        // int maxs=Integer.MIN_VALUE,res=0;
        // for(int n:nums){
        //     if(maxs<n){
        //         maxs=n;
        //     }
        //     mp.put(n,true);
        // }
        // for(int i=0;i<=maxs;i++){
        //     //Edge Case
        //     if(mp.size()==(maxs+1)){
        //         res=maxs+1;
        //         break;
        //     }
        //     if(!mp.containsKey(i)){
        //         res=i;
        //         break;
        //     }
        // }
        // return res;

        //Using Formula
        // int form=0,sum=0,x=nums.length,res;
        // for(int n:nums){
        //     sum+=n;
        // }
        // form=(x*(x+1))/2;
        // res=form - sum;
        // System.out.println(res);

        //Using Bits
        int sum=0,missSum=0;
        for(int i=1;i<nums.length+1;i++){
            sum ^= i;
        }
        for(int i=0;i<nums.length;i++){
            missSum ^= nums[i];
        }
        System.out.println(sum^missSum);

    }
}