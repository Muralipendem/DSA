
import java.util.*;

public class SingleNumber3{
    public static void main(String[] args) {
        int[] nums={-1, 2147483647};
        int[] res=new int[2];
        //first xor all numbers eleminate duplicates
        int xor=0,newxor=0,x=1;
        for(int n:nums){
            xor ^= n;
        }
        System.out.println(xor);
        //find the first rightmost bit which help us to find the unique bit
        for(int i=0;i<32;i++){
            if((xor & x) !=0) break;
            x=x<<1;
        }
        System.out.println(x);
        //find newxor which store the one unique value using the rightmost bit
        for(int n:nums){
            if((n&x)!=0){
                newxor ^= n;
            }
        }
        System.out.println(newxor);
        res[0]=newxor; //one unique value
        res[1]=newxor^xor; //second unique value can find first 2unique numbers xor and newxor
        System.out.println(Arrays.toString(res));
    }
}