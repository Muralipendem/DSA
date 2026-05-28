
public class PrimeSequence{
    public static void main(String args[]){
        int n=100;
        boolean[] prime = new boolean[n+1];
        prime[0]=prime[1]=false; // intial 0,1 always false
        //set true for all elements
        for(int i=2;i<=n;i++) prime[i]=true;
        //sieve algorithm
        for(int i=2;i*i<=n;i++){    
            if(prime[i]){
                //multiples is false
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){    
            if(prime[i]){
                System.out.println(i);
            }
        }
    }
}