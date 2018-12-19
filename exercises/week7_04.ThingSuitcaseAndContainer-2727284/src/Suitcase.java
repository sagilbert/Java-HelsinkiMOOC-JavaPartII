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

public class Suitcase {
    private List<Thing> list;
    private int limit;
    
    public Suitcase(int limit) {
        this.limit = limit;
        this.list = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        if (this.curWeight() + thing.getWeight() <= this.limit) {
            this.list.add(thing);
        }
    }
    public void printThings() {
        for (Thing t : this.list) {
            System.out.println(t);
        }
    }
    public int totalWeight() {
        return this.curWeight();
    }
    public int curWeight() {
        int sum = 0;
        for (Thing t : this.list) {
            sum += t.getWeight();
        }
        return sum;
    }
    public Thing heaviestThing() {
        if (this.list.isEmpty()) {
            return null;
        }
        Thing heaviest = this.list.get(0);
        for (Thing t : this.list) {
            if (t.getWeight() > heaviest.getWeight()) {
                heaviest = t;
            }
        }
        return heaviest;
    }
    public List<Thing> getList() {
        return this.list;
    }
    @Override
    public String toString() {
        String pre;
        if (this.list.size() == 0) {
            pre =  "empty (";
        } else if (this.list.size() == 1) {
            pre =  "1 thing (";
        } else {
            pre = this.list.size() + " things (";
        }
        return pre + this.curWeight() + " kg)";
    }
}
