package boxes;

import java.util.Collection;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.util.List;
import java.util.ArrayList;
public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> thingList;
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.thingList = new ArrayList<Thing>();

    }

    @Override
    public void add(Thing thing) {
        int curWeight = 0;
        for (Thing t : this.thingList) {
            curWeight += t.getWeight();
        }
        if (curWeight + thing.getWeight() <= this.maxWeight) {
            this.thingList.add(thing);
        }
        
    }
    @Override 
    public boolean isInTheBox(Thing thing) {
        for (Thing t : this.thingList) {
            if (t.equals(thing)) {
                return true;
            }
        }
        return false;
    }
    
}
