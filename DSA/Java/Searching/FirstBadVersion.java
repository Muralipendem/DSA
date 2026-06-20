public class FirstBadVersion{
    //internal implementation
    static public boolean isBadVersion(int n) {
        int bad=4; 
        return n>=bad;
    }
    public static void main(String[] args) {
        int n=10;
        int left=1,right=n;
        while(left<right){
            int mid=left+(right-left)/2;
            boolean isBad=isBadVersion(mid);
            if(isBad){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println(right);
        
    }
}