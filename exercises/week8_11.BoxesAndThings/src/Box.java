/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.ArrayList;
import java.util.List;
public class Box implements ToBeStored {
    private List<ToBeStored> items;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<ToBeStored>();
    }
    public void add(ToBeStored t) {
        if (this.weight() + t.weight() <= maxWeight) {
            items.add(t);
        }
    }
    
    public double weight() {
        double sum = 0;
        for (ToBeStored t : items) {
            sum += t.weight();
        }
        return sum;
    }
    @Override 
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + 
                this.weight() + " kg";
    }
    
}
