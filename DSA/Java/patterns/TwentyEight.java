import java.util.*;

public class TwentyEight{
    public static void main(String args[]){
        int n=9;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<(2*n-1);i++){
            for(int j=0;j<(2*n-1);j++){
                al.addAll(List.of(i, j, (2*n-1)-i-1, (2*n-1)-j-1));
                int mins=Collections.min(al);
                System.out.print(n-mins+" ");
                al.clear();
            }
            System.out.println("");
        }
    }
}