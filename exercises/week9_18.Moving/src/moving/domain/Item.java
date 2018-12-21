/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;

/**
 *
 * @author sam
 */
public class Item implements Thing, Comparable<Item> {
    
    private String name;
    private int vol;

    public Item(String name, int vol) {
        this.name = name;
        this.vol = vol;
    } 
    
    public int compareTo(Item other) {
        //Item toCompare = (Item) other;
        return this.getVolume() - other.getVolume();
    }

    public int getVolume() {
        return this.vol;
    }
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return getName() + " (" + getVolume() + " dm^3)";
    }
    
    
    
}
