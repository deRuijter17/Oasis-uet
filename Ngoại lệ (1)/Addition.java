public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}