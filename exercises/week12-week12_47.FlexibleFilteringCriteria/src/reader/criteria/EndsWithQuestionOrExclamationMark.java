package reader.criteria;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 8, 2018
 */
public class EndsWithQuestionOrExclamationMark implements Criterion{

    public EndsWithQuestionOrExclamationMark() {

    }

    @Override
    public boolean complies(String line) {
        if (line.length() == 0) {
            return false;
        }
        String lastChar = line.substring(line.length()-1);
        return lastChar.matches("[!?]");
    }
    
}
