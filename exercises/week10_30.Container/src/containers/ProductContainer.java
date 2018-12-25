package containers;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
public class ProductContainer extends Container{
    private String productName;
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;

    }
    public String getName() {
        return this.productName;
    }
    public void setName(String newName) {
        this.productName = newName;
    }
    public String toString() {
        return this.getName() + ": " + super.toString();
    }
}
