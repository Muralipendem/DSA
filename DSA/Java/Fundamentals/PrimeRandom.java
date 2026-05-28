import java.util.*;

public class PrimeRandom{
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>(List.of(24,8,7,56,18,19,45,9));
        int maxnum=Collections.max(al);
        boolean[] prime = new boolean[maxnum+1];
        prime[0]=prime[1]=false; // intial 0,1 always false
        //set true for all elements
        for(int i=2;i<=maxnum;i++) prime[i]=true;
        //sieve algorithm
        for(int i=2;i*i<=maxnum;i++){    
            if(prime[i]){
                //multiples is false
                for(int j=i*i;j<=maxnum;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=0;i<al.size();i++){    
            if(prime[al.get(i)]){
                System.out.println(al.get(i));
            }
        }
    }
}