import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** 4 args constructor. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** 5 args constructor. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Override equals. */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle r = (Rectangle) obj;
            return Math.abs(topLeft.getPointY() - r.getTopLeft().getPointY())
                    <= 0.001
                    && Math.abs(topLeft.getPointX() - r.getTopLeft().getPointX())
                    <= 0.001
                    && Math.abs(this.width - r.getWidth()) <= 0.001
                    && Math.abs(this.length - r.getLength()) <= 0.001;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public String toString() {
        return ("Rectangle[topLeft=(" + Math.round(topLeft.getPointX() * 10) / 10.0 + ","
                + Math.round(topLeft.getPointY() * 10) / 10.0 + "),width="
                + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]");
    }
}
