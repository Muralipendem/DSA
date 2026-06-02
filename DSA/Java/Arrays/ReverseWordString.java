import java.util.*;

public class ReverseWordString{
    public static void main(String[] args) {
        String s = "a good   example";
        String[] t = s.strip().split("\\s+");
        System.out.println(Arrays.toString(t));
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.print(t[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        // System.out.println();
        // int l=0,r=s.length();
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s[i]!=" "){

        //     }
        // }
    }
}