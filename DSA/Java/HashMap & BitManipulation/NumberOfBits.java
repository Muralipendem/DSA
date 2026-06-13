class NumberOfBits {
    public static void main(String args[]) {
        int count=0,n=11;
        while(n!=0){
            if((n&1)==1) count++;
            n=n>>1;
        }
        System.out.println(count);
    }
}