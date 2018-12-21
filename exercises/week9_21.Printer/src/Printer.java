/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.io.File;
import java.util.Scanner;

public class Printer {
    
    private String filename;
    private File file;
    
    public Printer(String fileName) throws Exception {
        this.filename = filename;
        this.file = new File(fileName);
        
    }
    public void printLinesWhichContain(String word) {
        try {
            Scanner reader = new Scanner(this.file);
            if (word.isEmpty()) {
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            }
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);

                }
            }
        } catch (Exception e) {
            System.out.println("Whoops, there was an error");
        }

        
       
        
    }
    
}
