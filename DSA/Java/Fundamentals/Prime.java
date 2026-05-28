
public class Prime{
    public static void main(String args[]){
        int n=17;
        Boolean flag=true;
        for(int i=2;i*i<=n;i++){    //same as like a sqrt
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}