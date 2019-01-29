package wormgame.domain;
import java.util.*;
import wormgame.*;
/**
 *
 * @author Samuel Gilbert
 * Date: Dec 11, 2018
 */
public class Worm {
    private Direction direction;
    private List<Piece> pieces;
    private boolean grow;
    
    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
        this.direction = originalDirection;       
        this.grow = false;
    }
    public Direction getDirection() {
        return this.direction;
    }
    public void setDirection(Direction dir) {
        this.direction = dir;
    }
    
    public int getLength() {
        return this.pieces.size();
    }
    public List<Piece> getPieces() {
        return this.pieces;
    }
    public boolean getGrow() {
        return this.grow;
    }
    public void move() {
        if (getDirection() == Direction.RIGHT) {
            pieces.add(new Piece(pieces.get(getLength() - 1).getX()+1, pieces.get(getLength() - 1).getY()));
        } else if (getDirection() == Direction.LEFT) {
            pieces.add(new Piece(pieces.get(getLength() - 1).getX()-1, pieces.get(getLength() - 1).getY()));
        } else if (getDirection() == Direction.UP) {
            pieces.add(new Piece(pieces.get(getLength() - 1).getX(), pieces.get(getLength() - 1).getY()-1));
        } else if (getDirection() == Direction.DOWN) {
            pieces.add(new Piece(pieces.get(getLength() - 1).getX(), pieces.get(getLength() - 1).getY()+1));
        }
        
        if (getLength() <= 3) {
            this.grow = true;
        }
        if (!grow) {
            pieces.remove(0);
        }
        
        this.grow = false;
        

    }
    
    public void grow() {
        this.grow = true;
    }
    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }
    public boolean runsIntoItself() {
        for (int i = 0; i < getLength()-1; i++) {
            for (Piece p : pieces.subList(i+1, getLength())) {
                if (p.runsInto(pieces.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    public Piece wormHead() {
        return pieces.get(getLength() - 1);
    }
    
}
