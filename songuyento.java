public class Solution {
    /**
     * kiem tra so nguyen to.
     * 
     * @param n la so can kt
     * @return
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}  