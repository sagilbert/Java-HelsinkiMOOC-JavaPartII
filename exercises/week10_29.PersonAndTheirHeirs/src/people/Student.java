package people;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address); 
        this.credits = 0;

    }
    public void study() {
        credits++;
    }
    public int credits() {
        return credits;
    }
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + this.credits();
    }
}
