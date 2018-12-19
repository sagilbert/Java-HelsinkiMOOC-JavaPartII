/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    private Map<String, Double> notes;
    
    public PromissoryNote() {
        this.notes = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value) {
        this.notes.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose) {
        if (this.notes.keySet().contains(whose)) {
            return this.notes.get(whose);
        } else {
            return 0;
        }
    }
    
    
}
