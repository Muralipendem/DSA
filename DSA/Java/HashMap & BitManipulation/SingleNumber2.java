public class SingleNumber2{
    public static void main(String[] args) {
        int[] nums={2,2,-3,2};
        int res = 0;
        ////This is my approach using bits.
        for (int x = 0; x < 32; x++) {
            int count = 0;
            for (int i : nums) {
                if (((i >> x) & 1) != 0) count++;
            }
            if (count % 3 != 0) res |= (1 << x);
        }
        System.out.println(res);

        //This is Another same approach bus reduce the outer loop range. but it doesn't find negative unique.

        int x=1,maxs=Integer.MIN_VALUE;
        for(int n:nums){
            if(maxs<n) maxs=n;
        }
        while(x<=maxs){
            int count = 0;
            for (int i : nums) {
                if ((i & x) > 0) count++;
            }
            if (count % 3 != 0) res |= x;
            x = x << 1;
        }
        System.out.println(res);

    }
}