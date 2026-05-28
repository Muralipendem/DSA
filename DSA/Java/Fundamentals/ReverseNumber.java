
public class ReverseNumber{
    public static void main(String args[]){
        int rev=0;
        int n=101;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}