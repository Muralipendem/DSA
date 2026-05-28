
public class SmallDigit{
    public static void main(String args[]){
        int n=58391;
        int small=n;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(small>rem) small=rem;
        }
        System.out.println(small);
    }
}