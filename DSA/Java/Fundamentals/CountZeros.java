
public class CountZeros{
    public static void main(String args[]){
        int count=0;
        int n=9999;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rem==0) count++;
        }
        System.out.println(count);
    }
}