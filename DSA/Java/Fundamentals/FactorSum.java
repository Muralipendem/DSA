
public class FactorSum{
    public static void main(String args[]){
        int n=10;
        int sum=0;
        for(int i=1;i*i<=n;i++){    //same as like a sqrt
            if(i*i==n) sum+=i;   //edge case 
            else if(n%i==0){
                sum+=i+(n/i);
            }
        }
        System.out.println(sum);
    }
}