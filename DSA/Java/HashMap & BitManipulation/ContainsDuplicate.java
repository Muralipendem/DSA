
import java.util.HashSet;

public class ContainsDuplicate{
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        //Using HashSet
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        System.out.println(set.size()!=nums.length);

    }
}