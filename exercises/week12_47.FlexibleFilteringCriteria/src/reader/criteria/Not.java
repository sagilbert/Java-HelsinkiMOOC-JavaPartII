package reader.criteria;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 8, 2018
 */
public class Not implements Criterion{
    Criterion crit;
    public Not(Criterion crit) {
        this.crit = crit;
    }
    
    public boolean complies(String line) {
        return !crit.complies(line);
    }
}
