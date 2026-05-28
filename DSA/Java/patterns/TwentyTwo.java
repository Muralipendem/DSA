public class TwentyTwo{
    public static void main(String args[]){
        int n=5;
        int num=n*n;
        for(int i=0;i<n;i++){
            String s="";
            for(int j=0;j<n;j++){
                if(j==n-1){
                    s=num+s;
                }
                else{
                    s="*"+num+s;
                }
                num-=1;
            }
            System.out.println(s);
        }
    }
}