public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {

    }

    public double evaluate() {
        return value;
    }

    public String toString() {
        return "" + (int) value;
    }
}