package tools;
/**
 *
 * @author Samuel Gilbert
 * Date: Nov 17, 2018
 */
import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> strings;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        this.strings = new HashSet<String>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (strings.contains(characterString)) {
            duplicates++;
        }
        
        strings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicates =0;
    }
    
}
