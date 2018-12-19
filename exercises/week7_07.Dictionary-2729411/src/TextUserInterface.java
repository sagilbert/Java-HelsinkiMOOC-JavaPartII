/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }
    public TextUserInterface() {
        this(new Scanner(System.in), new Dictionary());
    }
    public void start(){
        String statement;
        System.out.println("Statements:\n" +
"  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface");
        System.out.println("");
        while (true) {
            System.out.print("Statement: ");
            statement = this.reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                this.add();
            } else if (statement.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown Statement");
            }
            System.out.println("");
            
        }
    }
    public void add() {
        System.out.print("In Finnish: ");
        String word1 = this.readIn();
        System.out.print("Translation: ");
        String word2 = this.readIn();
        this.dict.add(word1, word2);
        
    }
    public void translate() {
        System.out.print("Give a word: ");
        String word = this.readIn();
        System.out.println("Translation: " + this.dict.getDict().get(word));
    }
    public String readIn() {
        return this.reader.nextLine();
    }
}
