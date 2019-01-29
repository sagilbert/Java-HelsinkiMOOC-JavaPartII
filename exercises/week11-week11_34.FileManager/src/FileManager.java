
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File toRead = new File(file);
        Scanner reader = new Scanner(toRead);
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNext()) {
            list.add(reader.nextLine());
        }
        
        return list;
    }

    public void save(String file, String text) throws IOException {
        File toWriteto = new File(file);
        FileWriter writer = new FileWriter(toWriteto, false);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) {
        try {File toWriteto = new File(file);
        FileWriter writer = new FileWriter (toWriteto, true);
        for (String toWrite : texts) {
            writer.write(toWrite + "\n");
        }
        writer.close();
        }
        catch (Exception e) {
            
        }
        
    }
}
