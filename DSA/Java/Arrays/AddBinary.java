public class AddBinary{
    public static void main(String args[]){
        String a="111",b="11";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            res = (sum % 2) + res;
            carry = sum / 2;
        }
        if (carry > 0) res = carry + res;
        System.out.println(res);
    }
}