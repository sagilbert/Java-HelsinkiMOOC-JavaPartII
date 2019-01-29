package dungeon;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 21, 2018
 */
public class Vampire implements Being {
    private Position position;
    
    public Vampire(Position position) {
        this.position = position;

    }
    public Position getPosition() {
        return this.position;
    }
    public String getMark() {
        return "v";
    }
    public void move(String command, int length, int height) {
        ;

    }
    public String toString() {
        return "Vampire " + this.getPosition().toString();
    }    
    
}
