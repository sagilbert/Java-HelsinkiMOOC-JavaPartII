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
import java.util.Collections;

public class Jumper implements Comparable<Jumper>{
    
    private String name;
    private List<Integer> scores;
    private List<Integer> lengths;
    
    public Jumper(String name) {
        this.name = name;
        this.scores = new ArrayList<Integer>();
        this.lengths = new ArrayList<Integer>();
    }
    
    public int curScore() {
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        for (int i : lengths) {
            sum += i;
        }
        return sum;
    }
    @Override 
    public String toString() {
        return name + " (" + this.curScore() + " points)";
    }
    public String getName() {
        return this.name;
    }
    public void addLength(int length) {
        this.lengths.add(length);
    }
    public List<Integer> getLengths() {
        return this.lengths;
    }
    public String lengthsAsString() {
        String str = "";
        if (this.lengths.size() > 0) {
            for (int i : this.lengths) {
                str = str + Integer.toString(i) + " m, ";
            }
            return str.substring(0, str.length()-2);            
        }
        return str;

    }
    public void addVotes(ArrayList<Integer> votesToAdd) {
        votesToAdd.remove(Collections.max(votesToAdd));
        votesToAdd.remove(Collections.min(votesToAdd));
        for (int i : votesToAdd) {
            this.scores.add(i);
        }
    }
    @Override 
    public int compareTo(Jumper other) {
        //sort in ascending order
        return this.curScore() - other.curScore();
    }
    
}
