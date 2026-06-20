public class SumOfIntegers{
    public static void main(String args[]){
        int a=1,b=3;
        while(b!=0){
            int carry=(a&b)<<1;
            a = a ^ b;
            b=carry;
        }
       System.out.println(a);
    }
}
//Xor - Add Bits(partial sum)
//AND + Shift - Carry Bits