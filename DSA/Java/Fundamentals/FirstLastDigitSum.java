
public class FirstLastDigitSum{
    public static void main(String args[]){
        int n=10401;
        int sum=n%10;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(n==0) sum+=rem;
        }
        System.out.println(sum);
    }
}