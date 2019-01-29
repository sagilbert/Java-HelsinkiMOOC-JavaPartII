package reference.domain;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 6, 2018
 */
public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Person)) {
            return false;
        }
        Person toCompare = (Person) o;
        if (this.getName().equals(toCompare.getName())) {
            return true;
        } else {
            return false;
        }
        
    }
    public int hashCode() {
        return name.hashCode();
    }
    public String toString() {
        return getName();
    }
}
