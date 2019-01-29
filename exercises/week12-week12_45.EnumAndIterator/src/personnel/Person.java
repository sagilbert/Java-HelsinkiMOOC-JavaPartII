package personnel;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 6, 2018
 */
public class Person {
    private String name;
    private Education edType;

    public Person(String name, Education educationType) {
        this.name = name;
        this.edType = educationType;

    }

    public Education getEducation() {
        return edType;
    }
    @Override
    public String toString() {
        return name + ", " + getEducation();
    }
    
}
