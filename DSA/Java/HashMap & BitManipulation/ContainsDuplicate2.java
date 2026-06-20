import java.util.*;

public class ContainsDuplicate2{
    public static void main(String[] args) {
        int[] nums={1,0,1,1};
        int k=3;
        //brute force approach
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]==nums[j]) && Math.abs(i-j)<=k){
        //             System.out.println(true);
        //             break;
        //         }
        //     }
        // }
        // System.out.println(false);

        //Using HashMap
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        boolean res=false;
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],new ArrayList<>());
                mp.get(nums[i]).add(i);
            }else{
                mp.get(nums[i]).add(i);
            }
        }
        System.out.println(mp);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : mp.entrySet()) {
            ArrayList<Integer> indices = entry.getValue();
            for (int i = 1; i < indices.size(); i++) {
                if (indices.get(i) - indices.get(i - 1) <= k) {
                    res=true;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}