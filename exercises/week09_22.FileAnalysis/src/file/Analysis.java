package file;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Samuel Gilbert
 * Date: Nov 16, 2018
 */
public class Analysis {
    private File file;

    public Analysis(File file) throws Exception{
        this.file = file;

    }
    public int lines() throws Exception {
        int sum = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            sum++;
            reader.nextLine();
        }
        return sum;
    }
    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int chars = lines();  //TMC output was off by the number of lines

        while (reader.hasNextLine()) {
            String s1 = reader.useDelimiter("").nextLine();
            chars += s1.length();
        }
        reader.close();
        return chars;
    }
}
