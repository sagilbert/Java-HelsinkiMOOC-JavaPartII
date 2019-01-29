package dungeon;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 21, 2018
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Position)) {
            return false;
        } else {
            Position test = (Position) o;
            if (this.x == test.getX() && this.y == test.getY()) {
                return true;
            } else {
                return false;
            }
        }
        
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.x;
        hash = 71 * hash + this.y;
        return hash;
    }
    
    public String toString() {
        return this.x + ", " + this.y;
    }

}
