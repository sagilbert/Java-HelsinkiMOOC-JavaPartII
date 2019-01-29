package farmsimulator;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.util.Collection;
import java.util.ArrayList;
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> animals;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.animals = new ArrayList<Cow>();
                
    }
    public void addCow(Cow cow) {
        this.animals.add(cow);
    }

    @Override
    public void liveHour() {
        for (Cow c : this.animals) {
            c.liveHour();
        }
    }
    public String getOwner() {
        return this.owner;
    }
    public String toString() {
        String cowsString;
        if (this.animals.isEmpty()) {
            cowsString = "No cows.";
        } else {
            cowsString = "Animals:\n";
            for (Alive a : this.animals) {
                cowsString += "        " + a.toString() + "\n";
            }
                    
        }
        return "Farm owner: " + this.getOwner() + "\nBarn bulk tank: " + 
                this.barn.getBulkTank().toString() + 
                "\n" + cowsString;
    }
    public void manageCows() {
        this.barn.takeCareOf(this.animals);
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
    
}
