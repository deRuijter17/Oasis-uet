public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * constructor for a move.
     * 
     * @param startX the starting x coordinate
     * @param startY the starting y coordinate
     * @param endX the ending x coordinate
     * @param endY the ending y coordinate
     * @param movedPiece the piece that was moved
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * constructor for a move.
     * 
     * @param startX the starting x coordinate
     * @param startY the starting y coordinate
     * @param endX the ending x coordinate
     * @param endY the ending y coordinate
     * @param movedPiece the piece that was moved
     * @param killedPiece the piece that was killed
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }
    
    public Piece getMovedPiece() {
        return movedPiece;
    }
    
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }
    
    public Piece getKilledPiece() {
        return killedPiece;
    }
    
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    @Override
    public String toString() {
        return String.format("%s-%s%c%d", movedPiece.getColor(), movedPiece.getSymbol(),
                endX - 1 + 'a', endY);
    }
}
