public class Bishop extends Piece {
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (Math.abs(x - getCoordinatesX()) != Math.abs(y - getCoordinatesY())) {
            return false;
        }
        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor() == this.getColor()) {
                return false;
            }
        }
        int tempX = x < getCoordinatesX() ? -1 : 1;
        int tempY = y < getCoordinatesY() ? -1 : 1;
        for (int i = getCoordinatesX() + tempX, j = getCoordinatesY() + tempY;
                 i != x; i += tempX, j += tempY) {
            if (board.getAt(i, j) != null) {
                return false;
            }
        }
        return true;
    }
}
