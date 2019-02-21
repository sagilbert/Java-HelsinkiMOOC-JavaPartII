package farmsimulator;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
public class BulkTank {
    
    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000);
        
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume= 0;
        
    }
    public double getCapacity() {
        return this.capacity;
        
    }
    public double getVolume() {
        return this.volume;
        
    }
    public double howMuchFreeSpace() {
        return this.getCapacity() - this.getVolume();
        
    }
    public void addToTank(double amount) {
        if (this.howMuchFreeSpace() < amount) {
            this.volume = this.getCapacity();
        } else {
            this.volume += amount;
        }
    }
    public double getFromTank(double amount) {
        if (this.getVolume() < amount) {
            this.volume = 0;
            return this.getVolume();
        } else {
            this.volume -= amount;
            return amount;
        }
        
    }
    public String toString() {
        return Math.ceil(this.getVolume()) + "/" + Math.ceil(this.getCapacity());
    }
        
}
