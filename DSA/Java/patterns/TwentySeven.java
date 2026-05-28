public class TwentySeven{
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            String s="";
            for(int j=1;j<=i;j++){
                s+=j+" ";
            }
            System.out.println(s);
        }
        for(int i=n-1;i>0;i--){
            String s="";
            for(int j=1;j<=i;j++){
                s+=j+" ";
            }
            System.out.println(s);
        }
        
    }
}