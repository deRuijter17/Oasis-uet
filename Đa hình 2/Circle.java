import java.util.Objects;

public class Circle extends Shape {
    static final double PI = Math.PI;
    protected Point center;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** 3 args construction. */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /** 4 args construction. */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /** Override equals. */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return Math.abs(center.getPointY() - c.getCenter().getPointY()) <= 0.001
                    && Math.abs(center.getPointX() - c.getCenter().getPointX()) <= 0.001
                    && Math.abs(this.radius - c.radius) <= 0.001;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(radius, center);
    }

    @Override
    public String toString() {
        return ("Circle[center=(" + Math.round(center.getPointX() * 10) / 10.0 + ","
                + Math.round(center.getPointY() * 10) / 10.0 + ")" + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]");
    }
}
