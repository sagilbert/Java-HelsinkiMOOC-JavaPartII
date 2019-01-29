package dungeon;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 21, 2018
 */
public class Player implements Being {
    private Position position;
    public Player(Position position) {
        this.position = position;
    }
    public Position getPosition() {
        return this.position;
    }
    public String getMark() {
        return "@";
    }
    public void move(String command, int length, int height) {
            if (command.equals("w")) {
                if (this.position.getY() - 1 >= 0) {
                this.position.setPosition(this.position.getX(), this.position.getY()-1);
                }
            } else if (command.equals("s")) {
                if (this.position.getY() + 1 <= height - 1) {
                this.position.setPosition(this.position.getX(), this.position.getY()+1);
                }
            } else if (command.equals("a")){
                if (this.position.getX() -1 >= 0) {
                this.position.setPosition(this.position.getX()-1, this.position.getY());
                }
            } else if (command.equals("d")){
                if (this.position.getX() +1 <= length - 1) {
                this.position.setPosition(this.position.getX()+1, this.position.getY());
                }
            }
        
    }
    public String toString() {
        return "Player " + this.getPosition().toString();
    }
}
