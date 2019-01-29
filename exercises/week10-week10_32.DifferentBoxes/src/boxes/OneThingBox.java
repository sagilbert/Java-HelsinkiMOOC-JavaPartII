package boxes;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
public class OneThingBox extends Box {
    
    private Thing thing;

    public OneThingBox() {

    }
    public boolean isInTheBox(Thing o) {
        if (this.thing == null) {
            return false;
        }
        else {
            if (this.thing.getName().equals(o.getName())) {
                return true;
            } else {
                return false;
            }
        }

    }
    
    public void add(Thing o) {
        if (this.thing == null) {
            this.thing = o;
        }
    }


    

}
