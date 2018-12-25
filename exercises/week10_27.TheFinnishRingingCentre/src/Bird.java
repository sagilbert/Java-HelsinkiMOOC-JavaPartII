/**
 *
 * @author Samuel Gilbert
 * Date: Nov 19, 2018
 */
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + "(" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Bird)) {
            return false;
        }
        Bird o = (Bird) other;
        if (this.latinName.equals(o.getLatinName()) && 
                this.ringingYear == o.getRingingYear()) {
            return true;
        } else {
            return false;
        }
        
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 61 * hash + this.ringingYear;
        return hash;
    }
    

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }
    
}


