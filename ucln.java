public class Solution {
    /**
     * Tim UCLN cua 2 so.
     *
     * @param a so thu nhat
     * @param b so thu hai
     * @return UCLN
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return Math.abs(gcd(b, a % b));
    }
}   