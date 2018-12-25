package containers;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import containers.ContainerHistory;
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
        this.setVol(initialVolume);
           
        }
    public String history() {
        return this.history.toString();

    }
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
        
    }
    public double takeFromTheContainer(double amount) {
        double temp = super.takeFromTheContainer(amount); //To change body of generated methods, choose Tools | Templates.     
        this.history.add(super.getVolume());
        return temp;
        
    }
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance: "+ this.history.variance());
    }
}
