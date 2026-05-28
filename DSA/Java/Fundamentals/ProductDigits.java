
public class ProductDigits{
    public static void main(String args[]){
        int pro=1;
        int n=345;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            pro*=rem;
        }
        System.out.println(pro);
    }
}