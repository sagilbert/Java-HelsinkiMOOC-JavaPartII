package PhoneSearch;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 19, 2018
 */
public class Address {
    
    private String street;
    private String city;
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return this.street + " " + this.city;
    }
}
