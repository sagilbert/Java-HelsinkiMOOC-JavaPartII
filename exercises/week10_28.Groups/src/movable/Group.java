package movable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
public class Group implements Movable {
    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable o : group) {
            o.move(dx, dy);
        }
    }
    @Override
    public String toString() {
        String toReturn = "";
        for (Movable o : group) {
            toReturn += o.toString() + "\n";
        }
        return toReturn;
    
    }
    public void addToGroup(Movable movable) {
        group.add(movable);
    }
}
