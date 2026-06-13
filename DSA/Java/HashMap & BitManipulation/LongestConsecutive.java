
import java.util.*;

public class LongestConsecutive{
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        int res=0;
        HashMap<Integer,Boolean> mp=new HashMap<>();
        for(Integer n:nums){
            mp.put(n,true);
        }
        System.out.println(mp);
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i]-1)){
                int count=0,x=nums[i];
                while(mp.containsKey(x)){
                    count++;
                    x++;
                }
                res = Math.max(res,count);
            }
        }
        
        System.out.println(res);
    }
}