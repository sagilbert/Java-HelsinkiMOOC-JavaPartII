package PhoneSearch;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 17, 2018
 */
import java.util.*;
public class PhoneBook {
    
    private List<Person> people;
    private Scanner reader;
    
    public PhoneBook() {
        this.people = new ArrayList<Person>();
        this.reader = new Scanner(System.in);
    }
    
    public void addPerson(Person p) {
        this.people.add(p);
    }

    public List<Person> getPeople() {
        return people;
    }
    
    public void start() {
        System.out.println("phone search\n" +
        "available operations:\n" +
        " 1 add a number\n" +
        " 2 search for a number\n" +
        " 3 search for a person by phone number\n" +
        " 4 add an address\n" +
        " 5 search for personal information\n" +
        " 6 delete personal information\n" +
        " 7 filtered listing\n" +
        " x quit");
        System.out.println("");
        String command;
        while (true) {
            System.out.print("command: ");
            command = this.readIn(); 
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                this.command1();
               
            } else if (command.equals("2")) {
                this.command2();
            } else if (command.equals("3")) {
                this.command3();
            } else if (command.equals("4")) {
                this.command4();
            } else if (command.equals("5")) {
                this.command5();
            } else if (command.equals("6")) {
                this.command6();
            } else if (command.equals("7")) {
                this.command7();
            }
            System.out.println("");
        }
    }
    
    public void command7() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = this.readIn();
        ArrayList<Person> toPrint = new ArrayList<Person>();
        if (keyword.equals("")) {          
            for (Person p : this.people) {
                toPrint.add(p);
            }
        } else {

        for (Person p : this.people) {
            boolean flag = false;            
            if (p.containsString(keyword)) {
                 
                flag = true;
            }
            if (flag) {
                toPrint.add(p);
            }
        }
        if (toPrint.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            Collections.sort(toPrint);
            for (Person p : toPrint) {
                System.out.println("");
                p.printAllInformation();
            }
        }
        }
    }
    
    public void command6() {
        System.out.print("whose information: ");
        String name = this.readIn();
        if (this.has(name)) {
            Person temp = this.getPerson(name);
            this.people.remove(temp);
        }
        
        ;
    }
    public void command5() {
        System.out.print("whose information: ");
        String search = this.readIn();
        if (this.has(search)) {
            Person temp = this.getPerson(search);
            temp.printAllInformationNoName();    
            
        } else {
            System.out.println("  not found");
        }
    }
    
    public void command4() {
        System.out.print("whose address: ");
        String name = this.readIn();
        System.out.print("street: ");
        String street = this.readIn();
        System.out.print("city: ");
        String city = this.readIn();
        if (this.has(name)) {
            Person temp = this.getPerson(name);
            temp.addAddress(street, city);
        } else {
            Person toAdd = new Person(name);
            toAdd.addAddress(street, city);
            this.addPerson(toAdd);
        }
        
    }
    
    public void command3() {
        boolean flag = false;
        System.out.print("number: ");
        String search = this.readIn();
        for (Person p : this.people) {
            for (String num : p.getPhoneNumber()) {
                if (num.equals(search)) {
                    System.out.println(" " + p.getName());
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println(" not found");
        }
    }
    
    public void command2() {
        System.out.print("whose number: ");
        String name = this.readIn();
        if (this.has(name)) {
            Person temp = this.getPerson(name);
            for (String num : temp.getPhoneNumber()) {
                System.out.println(" " + num);
            }
        } else {
            System.out.println("  not found");
        }
    } 
    
    public void command1() {
        System.out.print("whose number: ");
        String name = this.readIn();
        System.out.print("number: ");
        String num = this.readIn();
       if (this.has(name)) {
           getPerson(name).addPhoneNumber(num);
       } else {
           Person toAdd = new Person(name);
           toAdd.addPhoneNumber(num);
           this.people.add(toAdd);
       }
    }

    public boolean has(String name) {
        for (Person p : this.people) {
            if (p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name) {
        for (Person p : this.people) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        
        return null;
    }
    public String readIn() {
        return this.reader.nextLine();
    }    
    
    

}
