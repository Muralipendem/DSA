
public class SpyNumber{
    public static void main(String args[]){
        int sum=0;
        int pro=1;
        int n=145;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum+=rem;
            pro*=rem;
        }
        if(sum==pro) System.out.println("Spy Number");
        else System.out.println("Not Spy Number");
    }
}