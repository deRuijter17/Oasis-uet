import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * adds a piece to the board.
     * 
     * @param piece the piece to be added
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
        && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * validates the coordinates.
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @return true if the coordinates are valid, false otherwise
     */
    public static boolean validate(int x, int y) {
        if (x <= WIDTH && x >= 1 && y <= HEIGHT && y >= 1) {
            return true;
        }
        return false;
    }
    

    /**
     * removes a piece from the board.
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                return;
            }
        }
    }

    /**
     * gets the piece at the specified coordinates.
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @return the piece at the specified coordinates, null if there is no piece
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
