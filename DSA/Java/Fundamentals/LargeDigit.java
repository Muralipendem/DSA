
public class LargeDigit{
    public static void main(String args[]){
        int large=0;
        int n=34895;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(large<rem) large=rem;
        }
        System.out.println(large);
    }
}