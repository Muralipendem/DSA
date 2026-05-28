
public class CountPrimeDigit{
    public static void main(String args[]){
        int count=0;
        int n=4680;
        int rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            boolean flag=true;
            if(rem==1 || rem==0) flag=false;
            else for(int i=2;i*i<=rem;i++){
                if(rem%i==0) flag=false;break;
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}