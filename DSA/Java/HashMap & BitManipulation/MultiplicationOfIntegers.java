public class MultiplicationOfIntegers{
    public static void main(String args[]){
        int a=15,b=3;
        int res=0;
        while(b!=0){
            if((b&1)==1){
                res+=a;
            }
            a=a<<1;
            b=b>>1;
        }
       System.out.println(res);
    }
}

