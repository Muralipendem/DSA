import java.util.*;

public class NumberFactors{
    public static void main(String args[]){
        int n=36;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i*i<=n;i++){    //same as like a sqrt
            if(i*i==n) al.add(i);   //edge case 
            else if(n%i==0){
                al.add(i);
                al.add(n/i);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++) System.out.println(al.get(i));
    }
}