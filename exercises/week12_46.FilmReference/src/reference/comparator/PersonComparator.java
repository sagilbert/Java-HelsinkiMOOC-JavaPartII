package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 7, 2018
 */
public class PersonComparator implements Comparator<Person>{
    private Map<Person, Integer> peopleIdentities;
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return peopleIdentities.get(o2) - peopleIdentities.get(o1);
    }
    
}
