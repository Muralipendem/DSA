public class TwentyNine{
    public static void main(String[] args) {
        int n=5;
        // int alphanums=64+n;
        for(int i=1;i<=n;i++){
            String s="";
            char c=(char) (64+n);
            for(int j=1;j<=i;j++){
                s=c+" "+s;
                c-=1;
            }
            System.out.println(s);
        }
    }
}