package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 6, 2018
 */
public class Employees {
    private ArrayList<Person> employeeList;
    public Employees() {
        this.employeeList = new ArrayList<Person>();

    }
    public void add(Person person) {
        if (!(employeeList.contains(person))) {
            employeeList.add(person);
        }
    }
    public void add(List<Person> persons) {
        for (Person p : persons) {
            this.add(p);
        }
    }
    public void print() {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
