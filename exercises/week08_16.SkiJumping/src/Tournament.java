/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.*;

public class Tournament {
    
    private Scanner reader;
    private List<Jumper> jumpers;
    private int jumps;
    private Random random;
    
    public Tournament() {
        this(new Scanner(System.in));
    }
    
    public Tournament(Scanner reader) {
        this.reader = reader;
        this.jumpers = new ArrayList<Jumper>();
        this.jumps = 0;
        this.random = new Random();
    }
    
    public void start() {
        this.addJumpers();
        this.jumpInterface();
        this.printEndResults();

    }
    
    public void addJumpers() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; "
                + "an empty string brings you to the jumping phase.");
        String input;
        while (true) {
            System.out.print("  Participant name: ");
            input = readIn();
            if (input.equals("")) {
                break;
            } else {
                this.jumpers.add(new Jumper(input));
            }
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        
    }
    
    public void jumpInterface() {
        String input;
        while (true) {
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = readIn();
            if (!input.equals("jump")) {
                System.out.println("");
                break;
            } else {
                this.jump();
                
            }
        }
    }
        
    public void jump() {
        this.jumps++;
        Collections.sort(this.jumpers);
        System.out.println("");
        System.out.println("Round " + this.jumps);
        System.out.println("");
        System.out.println("Jumping order:");
        
        for (int i = 0; i < this.jumpers.size(); i++) {
            System.out.println("  " + (i+1) + ". " + this.jumpers.get(i));
        }
        System.out.println("");
        System.out.println("Results of round " + this.jumps);
        
        for (Jumper j : this.jumpers) {
            int length = random.nextInt(61) + 60;
            j.addLength(length);
            System.out.println("  " + j.getName());
            System.out.println("    length: " + length);
            ArrayList<Integer> judgeVotes = this.generateJudgeVotes();
            System.out.println("    judge votes: " + judgeVotes.toString());
            j.addVotes(judgeVotes);
        }
        
    }
    public void printEndResults() {
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(this.jumpers);
        for (int i=0; i < this.jumpers.size(); i++) {
            System.out.print((i+1)+"           ");
            System.out.println(this.jumpers.get(i));
            System.out.println("            jump lengths: " + this.jumpers.get(i).lengthsAsString());
            
        }      
        
    }
    
    public ArrayList<Integer> generateJudgeVotes() {
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            votes.add(this.random.nextInt(11) +10);
        }
        return votes;
           
    }
    public String readIn() {
        return this.reader.nextLine();
    }
}
      
    
    

    

