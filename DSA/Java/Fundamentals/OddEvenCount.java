
public class OddEvenCount{
    public static void main(String args[]){
        int even=0;
        int odd=0;
        int n=34895;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rem%2==0) even++;
            else odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}