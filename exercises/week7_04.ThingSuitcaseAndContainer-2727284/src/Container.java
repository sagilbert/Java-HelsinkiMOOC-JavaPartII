/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.List;
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private List<Suitcase> list;
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.curWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.list.add(suitcase);            
        }

    }
    public int curWeight() {
        int sum = 0;
        for (Suitcase s : this.list) {
            sum += s.totalWeight();
        }
        return sum;
    }
    public void printThings() {
        for (Suitcase s : this.list) {
            for (Thing t : s.getList()) {
                System.out.println(t);
            }
        }
    }
    
    @Override
    public String toString() {
        return this.list.size() + " suitcases (" + this.curWeight() + " kg)";
    }
}
