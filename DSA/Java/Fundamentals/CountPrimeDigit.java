
public class CountPrimeDigit{
    public static void main(String args[]){
        int count=0;
        int n=23067;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rem==2 || rem==3 || rem==5 || rem==7) count++;
        }
        System.out.println(count);
    }
}