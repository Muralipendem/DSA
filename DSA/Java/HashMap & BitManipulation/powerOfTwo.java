public class powerOfTwo{
    public static void main(String args[]){
        int n=64;
        boolean check=false;
        while(n>1){
            if(n%2==0) n=n/2;
            else{check=false;break;}
        }
        if(n==1) check=true;
        System.out.println(check);
    }
}