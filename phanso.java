public class Solution {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }
    
    /**
     * setter for denominator.
     * 
     * @param denominator gia tri can set
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    /**
     * tim ucln 2 so.
     * 
     * @param a so thu nhat
     * @param b so thu hai
     * @return UCLN
     */
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return Math.abs(gcd(b, a % b));
    }

    /**
     * rut gon phan so.
     * 
     * @return this
     */
    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        if (numerator * denominator > 0) {
            this.numerator = Math.abs(this.numerator) / gcd;
            this.denominator = Math.abs(this.denominator) / gcd;
        }
        return this;
    }

    /**
     * cong 2 phan so.
     * 
     * @param other phan so thu hai
     * @return this
     */
    public Solution add(Solution other) {
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int denominator = this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this.reduce();
    }

    /**
     * tru 2 phan so.
     * 
     * @param other phan so thu hai
     * @return this
     */
    public Solution subtract(Solution other) {
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int denominator = this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this.reduce();
    }

    /**
     * nhan 2 phan so.
     * 
     * @param other phan so thu hai
     * @return this
     */
    public Solution multiply(Solution other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        this.numerator = numerator;
        this.denominator = denominator;
        return this.reduce();
    }

    /**
     * chia 2 phan so.
     * 
     * @param other phan so thu hai
     * @return this
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            int numerator = this.numerator * other.denominator;
            int denominator = this.denominator * other.numerator;
            this.numerator = numerator;
            this.denominator = denominator;
        }
        return this.reduce();
    }

    /**
     * so sanh 2 phan so.
     * 
     * @param obj Object thu hai
     * @return true neu bang nhau, false neu khac nhau
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return this.numerator * other.denominator == this.denominator * other.numerator;
        }
        return false;
    }

}   