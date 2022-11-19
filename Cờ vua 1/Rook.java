public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }
    
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x != getCoordinatesX() && y != getCoordinatesY()) {
            return false;
        }
        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor() == this.getColor()) {
                return false;
            }
        }
        if (x == getCoordinatesX()) {
            int tempY = y < getCoordinatesY() ? -1 : 1;
            for (int i = getCoordinatesY() + tempY; i != y; i += tempY) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else {
            int tempX = x < getCoordinatesX() ? -1 : 1;
            for (int i = getCoordinatesX() + tempX; i != x; i += tempX) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
