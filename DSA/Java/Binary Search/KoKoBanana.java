public class KoKoBanana{
    public static void main(String[] args) {
        int[] piles={312884470};
        int h=312884469,left=1,right=Integer.MIN_VALUE,ans=-1;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>right){
                right=piles[i];
            }
        }
        while(left<=right){
            int mid=left+(right-left)/2;

            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours += Math.ceil((piles[i]*1.0) / mid);
                // instead of ceil you can use (piles[i]+mid-1)/mid this is also equalivalent to ceil.
            }
            if(hours<=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(ans);
    }
}