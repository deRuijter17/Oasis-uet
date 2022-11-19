import java.math.BigInteger;

public class Solution {
    /**
     * Tim so fibonacci thu n.
     * 
     * @param n so thu tu cua so fibonacci
     * @return so fibonacci thu n
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } 
        long previous = 1;
        long current = 0;
        for (int i = 0; i < n; i++) {
            BigInteger bigNums = BigInteger.valueOf(previous).add(BigInteger.valueOf(current));
            if (bigNums.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            long temp = previous + current;
            previous = current;
            current = temp;
        }
        return current;
    }
}   