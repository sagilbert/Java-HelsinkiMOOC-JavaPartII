package reader.criteria;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 8, 2018
 */
public class LengthAtLeast implements Criterion {
    private int len;
    public LengthAtLeast(int length) {
        this.len = length;
    }

    @Override
    public boolean complies(String line) {
        return line.length() >= len;
    }
    
}
