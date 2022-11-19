import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * moves a piece to the specified coordinates.
     * 
     * @param piece the piece to be moved
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void movePiece(Piece piece, int x, int y) {
        if (!Board.validate(x, y)) {
            return;
        }
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) != null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x, 
                    piece.getCoordinatesY(), y, piece, board.getAt(x, y)));
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(), x, 
                    piece.getCoordinatesY(), y, piece));
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
