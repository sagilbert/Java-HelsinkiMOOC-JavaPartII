package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        else if (name.isEmpty() || name.length() > 40 
                || age < 0 || age >120) {
            throw new IllegalArgumentException();
        } else {                   
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
