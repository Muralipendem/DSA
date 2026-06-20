public class GuessNumber{
    //internal implementation
    static public int guessNumber(int n) {
        int pick=6; 
        if(n<pick){
            return -1;
        }else if(n > pick){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n=10;
        int left=1,right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            int x=guessNumber(mid);
            if(x==0){
                System.out.println(mid);
                break;
            }else if(x==-1){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
    }
}