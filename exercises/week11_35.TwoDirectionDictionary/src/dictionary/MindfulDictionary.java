package dictionary;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 27, 2018
 */
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class MindfulDictionary {
    private HashMap<String, String> dict;
    private String fileName;
    private File file;

    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();

    }
    public MindfulDictionary(String file) {
        this();
        this.fileName = file;
        
    }
    public boolean load() {
        try {
            File file = new File(this.fileName);
            this.file = file;
            Scanner reader = new Scanner(this.file);
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean save() {
        try {
            File writeTo = new File(this.fileName);
            FileWriter writer = new FileWriter(writeTo, false);
            for (String key : this.dict.keySet()) {
                writer.write(key + ":" + this.dict.get(key) + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }

        }
    
    public void add(String word, String translation) {
        if (!this.dict.containsKey(word) && !this.dict.containsValue(translation)) {
            this.dict.put(word, translation);
        }
    }
    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else if (this.dict.containsValue(word)) {
            for (String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    return key;
                }
            }
        } else {
            return null;
        }
        return null;
    }
    public void remove(String word) {
        for (String key : this.dict.keySet()) {
            if (key.equals(word)) {
                this.dict.remove(key);
                break;
            } else if (this.dict.get(key).equals(word)) {
                this.dict.remove(key);
                break;
            }
        }
    }
            
}
