public class SingleNumber1{
    public static void main(String[] args) {
        //print unique number leetcode qn(136)
        int[] nums={2,2,-1};
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }
        System.out.println(res);

    }
}