package moving.logic;
import moving.domain.*;
import java.util.*;

public class Packer {
    
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxList = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);
        for (Thing thing : things) {
            if (box.addThing(thing)) {
                ;
            } else {
                boxList.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
            
        }
        
        boxList.add(box);
        return boxList;
    }
    
}
