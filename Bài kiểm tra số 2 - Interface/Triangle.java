public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor Triangle.
     * 
     * @param p1 point 1
     * @param p2 point 2
     * @param p3 point 3
     * @throws RuntimeException if 3 points are not on the same line
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) + p1.distance(p3) <= p2.distance(p3) 
            || p1.distance(p2) + p2.distance(p3) <= p1.distance(p3) 
            || p1.distance(p3) + p2.distance(p3) <= p1.distance(p2)) {
            throw new RuntimeException("Invalid triangle");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - p1.distance(p2)) * (s - p2.distance(p3)) * (s - p3.distance(p1)));
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]", 
                p1.getPointX(), p1.getPointY(), p2.getPointX(), 
                p2.getPointY(), p3.getPointX(), p3.getPointY());
    }
}
