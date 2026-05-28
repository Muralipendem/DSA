
public class Palindrome{
    public static void main(String args[]){
        int rev=0;
        int n=13312;
        int s=n;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        if(s==rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}