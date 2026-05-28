
public class Armstrong{
    public static void main(String args[]){
        int sum=0;
        int n=123;
        int s=n;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum+=Math.pow(rem,3);
        }
        if(s==sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}