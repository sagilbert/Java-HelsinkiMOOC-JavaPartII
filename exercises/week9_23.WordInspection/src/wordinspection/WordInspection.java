package wordinspection;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 16, 2018
 */
import java.io.File;
import java.util.*;
public class WordInspection {
    
    private File file;
    
    public WordInspection(File file) {
        this.file = file;

    }
    
    public int wordCount() throws Exception{
        int count = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            reader.nextLine();
            count++;
        }
        return count;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");   
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                list.add(line);
            }
        }
        return list;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");   
        ArrayList<String> list = new ArrayList<String>();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.length() >0) {
                if (line.substring(line.length() - 1).equals("l")) {
                    list.add(line);
                }
            }
        }
        return list;        
    }
    
    public List<String> palindromes() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");   
        List<String> palindromes = new ArrayList<String>(); 
        List<String> words = new ArrayList<String>();
        while (reader.hasNextLine()) {
            words.add(reader.nextLine());
        }
        for (String word : words) {
            boolean flag = true;
            if (word.length() >0) {
            for (int i = 0; i <= word.length()/2; i++) {
                if (!(word.charAt(i) == word.charAt(word.length() - 1 - i))) {
                    flag = false;
                }

                }
            
            if (flag) {
                palindromes.add(word);
            }
            }
        }
        return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");   
        List<String> words = new ArrayList<String>();
        List<String> list = new ArrayList<String>(); 
        
        while (reader.hasNextLine()) {
            words.add(reader.nextLine());
        }        
        for (String word : words) {
            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u") && word.contains("y")
                    && word.contains("ä") && word.contains("ö")) {
                list.add(word);
                
            }
        }
        return list;
    }
}
