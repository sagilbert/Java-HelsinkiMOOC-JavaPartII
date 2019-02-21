package boxes;
import java.lang.IllegalArgumentException;
public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) o;
        if (this.getName().equals(thing.getName())) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

}
