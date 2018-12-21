package moving.domain;
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    
    private int maxCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maxCapacity) {
            this.things.add(thing);
            return true;
        } else {
            return false;
        }        
    }
    
    public int getVolume() {
        int sum = 0;
        for (Thing t : this.things) {
            sum += t.getVolume();
        } 
        return sum;        
    }
}
