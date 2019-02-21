package clicker.applicationlogic;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 30, 2018
 */
public class PersonalCalculator implements Calculator {
    private int value;
    public PersonalCalculator() {
        this.value = 0;
    }

    @Override
    public int giveValue() {
        return this.value;
    }

    @Override
    public void increase() {
        this.value++;
    }
    
}
