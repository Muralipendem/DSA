public class TwentySix{
    public static void main(String[] args) {
        int n=7;
        for(int i=n;i>0;i--){
            String s="";
            for(int j=1;j<=(n-i);j++){
                s+=" ";
            }
            for(int j=1;j<=i;j++){
                s+=j+" ";
            }
            System.out.println(s);
        }
        for(int i=2;i<=n;i++){
            String s="";
            for(int j=1;j<=(n-i);j++){
                s+=" ";
            }
            for(int j=1;j<=i;j++){
                s+=j+" ";
            }
            System.out.println(s);
        }
        
    }
}