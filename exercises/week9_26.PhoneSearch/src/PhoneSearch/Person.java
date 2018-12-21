package PhoneSearch;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 17, 2018
 */
import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    
    private String name;
    private Address address;
    private List<String> phoneNumber;

    public Person(String name, String phoneNumber, Address address) {
        this.name = name;
        this.address = address;
        this.phoneNumber = new ArrayList<String>();
    }
    
    public Person(String name) {
        this(name, null, null);
    }
    
    public void addPhoneNumber(String num) {
        this.phoneNumber.add(num);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return this.address;
    }
    
    public void addAddress(String street, String city) {
        this.address = new Address(street, city);
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
    
    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName()); 
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Numbers: " + this.getPhoneNumber() +
                ", Address: " + this.getAddress();
    }
    
    public void printAllInformation() {                
        System.out.println(this.getName());
        this.printAllInformationNoName();

    }
    public void printAllInformationNoName() {
        String address;
        
        if (this.getAddress() == null) {
            address = "  address unknown";
        } else {
            address = "  address: " + this.getAddress().toString();
        }

        System.out.println(address);
        
        if (this.getPhoneNumber().isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String num : this.getPhoneNumber()) {
                System.out.println("   " + num);
            }
        }      
        System.out.println("");
        
    }
    
    public boolean containsString(String search) {
        boolean flag = false;
        if (this.address != null) {
            if (this.address.toString().contains(search)) {
                if (!flag) {
                    flag = true;
                }
        }
        }
        
        if (this.name != null) {
            if (this.name.contains(search)) {
                if (!flag) {
                    flag = true;
                }
        }
        }  
        
        for (String num : this.phoneNumber) {
            if (num.contains(search)) {
                if (!flag) {
                    flag = true;
                }
            }
        }
        return flag;
    }
    
}
