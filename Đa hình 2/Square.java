public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square s = (Square) obj;
            return Math.abs(topLeft.getPointY() - s.getTopLeft().getPointY())
                    <= 0.001
                    && Math.abs(topLeft.getPointX() - s.getTopLeft().getPointX())
                    <= 0.001
                    && Math.abs(this.width - s.getWidth()) <= 0.001
                    && Math.abs(this.length - s.getLength()) <= 0.001;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Square[topLeft=(" + Math.round(topLeft.getPointX() * 10) / 10.0
                + "," + Math.round(topLeft.getPointY() * 10) / 10.0 + "),side=" + length
                + ",color=" + color + ",filled=" + filled + "]");
    }
}