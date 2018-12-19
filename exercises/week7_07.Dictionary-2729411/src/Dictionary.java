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
import java.util.ArrayList;
import java.util.List;
public class Dictionary {
    private Map<String, String> dict;
    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }
    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
                
    }
    public void add(String word, String translation) {
        this.dict.put(word, translation);

    }
    public int amountOfWords() {
        return this.dict.size();
    }
    public List<String> translationList() {
        List<String> toReturn = new ArrayList<String>();
        for (String key : this.dict.keySet()) {
            toReturn.add(key + " = " + this.dict.get(key));
        }
        return toReturn;
    }
    public Map<String, String> getDict() {
        return this.dict;
    }
    
}
