package dictionary;

import java.util.Set;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 17, 2018
 */
import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }
        
        this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);
    }
    
}
