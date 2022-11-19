public class ExpressionTest {
    public static void main(String[] args) {
        Square sqr1 = new Square(new Numeral(10));

        Addition add1 = new Addition(sqr1, new Numeral(-3));

        Multiplication multi1 = new Multiplication(new Numeral(4), new Numeral(3));

        Addition add2 = new Addition(add1, multi1);

        Square sqr2 = new Square(add2);
        System.out.println(sqr2);
        System.out.println(sqr2.evaluate());
    }
}
