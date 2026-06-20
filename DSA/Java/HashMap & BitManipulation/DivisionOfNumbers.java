public class DivisionOfNumbers{
    public static void main(String args[]){
        int dividend=7,divisor=-2;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            System.out.println(Integer.MAX_VALUE);
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to avoid overflow when taking abs
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int res = 0;
        while (a >= b) {
            int k = 0;
            while (a >= (b << (k + 1))) {
                k++;
            }
            a -= (b << k);
            res += (1 << k);
        }

        System.out.println(negative ? -res : res);
    }
}

