public class SubtractOfIntegers{
    public static void main(String args[]){
        int a=400,b=200;
        b=~b+1;          // change positive value to negative value
        while(b!=0){
            int carry=(a&b)<<1; 
            a = a ^ b;
            b=carry;
        }
       System.out.println(a);
    }
}

