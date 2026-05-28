
public class PerfectNumber{
    public static void main(String args[]){
        int n=8128;
        int sum=0;
        for(int i=1;i*i<=n;i++){    //same as like a sqrt
            if(i*i==n || i==1) sum+=i;
            else if(n%i==0){
                sum+=i+(n/i);
            }
        }
        if(sum==n) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}