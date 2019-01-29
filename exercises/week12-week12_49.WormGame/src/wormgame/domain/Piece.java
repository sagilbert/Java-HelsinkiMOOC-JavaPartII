package wormgame.domain;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 11, 2018
 */
public class Piece {
    private int x;
    private int y;
    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Piece(Piece another) {
        this.x = another.getX();
        this.y = another.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean runsInto(Piece piece) {
        return (x == piece.getX() && y == piece.getY());
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
