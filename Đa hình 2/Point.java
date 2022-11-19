import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double x) {
        pointX = x;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double y) {
        pointY = y;
    }

    /** calculate distance between 2 points. **/
    public double distance(Point p) {
        return Math.sqrt(Math.pow(pointX - p.getPointX(), 2) 
                        + Math.pow(pointY - p.getPointY(), 2));
    }

    /** override equals */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return pointX == p.getPointX() && pointY == p.getPointY();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return ("(" + pointX + "," + pointY + ")");
    }
}
