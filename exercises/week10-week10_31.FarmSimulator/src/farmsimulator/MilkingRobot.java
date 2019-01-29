package farmsimulator;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.util.ArrayList;
import java.lang.IllegalStateException;

public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {

    }
    public BulkTank getBulkTank() {
        return this.tank;
    }
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.tank.addToTank(milkable.milk());
        }
    }
}
