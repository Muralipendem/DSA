public class LCM{
    public static void main(String[] args) {
        int a=12,b=14,temp,gcd,lcm;
        lcm=(a*b);
        // brute force approach
        // for(int i=1;i<=(a*b);i++){
        //     if(i%a==0 && i%b==0){
        //         System.out.println(i);
        //         return;
        //     }
        // }

        //Better approach as log(n) complexity --formula (lcm * gcd = num1 * num2)
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        gcd=a;
        lcm/=gcd;
        System.out.println(lcm);
    }
}