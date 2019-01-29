package reference.domain;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 6, 2018
 */
public class Film {
    private String name;
    public Film(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }   
    public String toString() {
        return this.name;
    }
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Film)) {
            return false;
        }
        Film toCompare = (Film) o;
        if (this.getName().equals(toCompare.getName())) {
            return true;
        } else {
            return false;
        }
        
    }
    public int hashCode() {
        return name.hashCode();
    }
}
