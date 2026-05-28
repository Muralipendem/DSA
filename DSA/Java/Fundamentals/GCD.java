public class GCD{
    public static void main(String args[]){
        //Subtract - Euclidean algorithm approach but large number it's worst case
        // while(a!=b){
        //     if(a>b) a=a-b;
        //     else b=b-a;
        // }
        // System.out.println(a);

        //iterative approach which is best as compare to prev one
        int a=6,b=3,temp;
        if(a==0){
            System.out.println(a);
            return;
        }
        if(b==0){
            System.out.println(b);
            return;
        }
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
        
    }
}