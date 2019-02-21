package farmsimulator;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.util.Random;
public class Cow implements Alive, Milkable {
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double udderCap;
    private double amount;
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    public Cow(String name) {
        this.name = name;
        int num = 15 + new Random().nextInt(26);
        this.udderCap = num;
        this.amount = 0;
    }

    @Override
    public void liveHour() {
        double toAdd = new Random().nextInt(14) + 7 ;
        toAdd = Math.ceil(toAdd/10);
        if (this.getAmount() + toAdd > this.getCapacity()) {
            this.amount = this.getCapacity();
        } else {
            this.amount += toAdd;
        }
    }

    @Override
    public double milk() {
        double temp = this.amount;
        this.amount = 0;
        return temp;
        
    }
    
    public String getName() {
        return this.name;
    }
    public double getCapacity() {
        return this.udderCap;
    }
    public double getAmount() {
        return this.amount;
    }
    public String toString() {
        return this.getName() + " " + this.getAmount() + "/" +  this.getCapacity();
    }
    
}
