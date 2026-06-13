
import java.util.*;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=target-nums[i];
            if(map.containsKey(s)){
                al.add(map.get(s));
                al.add(i);
                break;
            }
            map.put(nums[i],i);

        }
        System.out.println(al);
        System.out.println(map);
    }
}