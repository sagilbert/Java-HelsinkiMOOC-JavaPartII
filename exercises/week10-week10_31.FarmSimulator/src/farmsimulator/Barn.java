package farmsimulator;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.lang.IllegalStateException;
import java.util.Collection;
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    public BulkTank getBulkTank() {
        return this.tank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.getBulkTank());
    }
    public void takeCareOf(Cow cow) {
        if (this.robot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.robot.milk(cow);
        }
    }
    public void takeCareOf(Collection<Cow> cows) {
        if (this.robot == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            for (Milkable m : cows) {
                this.robot.milk(m);
            }
        }
    }
    public String toString() {
        return "Barn: " + this.tank.getVolume() + "/" + this.tank.getCapacity();
    }
}
