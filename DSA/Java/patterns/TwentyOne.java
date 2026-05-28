class TwentyOne {
    public static void main(String[] args) {
        int n = 4;
        int num = (n * (n + 1)) / 2;
        for(int i=n;i>0;i--){
            String s="";
            if(i%2==0){
                for(int j=0;j<i;j++){
                    s+=num;
                    num-=1;
                }
            }
            else{
                for(int j=0;j<i;j++){
                    s=num+s;
                    num-=1;
                }
            }
            System.out.println(s);
        }
    }
}