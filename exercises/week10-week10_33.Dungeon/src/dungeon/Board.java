package dungeon;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 21, 2018
 */
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Board {
    private Map<Position, String> board;
    private int length;
    private int height;
    private ArrayList<Vampire> vampires;
    private Player player;
    private ArrayList<Position> allPositions;
    private Random random;


    public Board(int length, int height) {
        this.length = length;
        this.height = height;
        this.board = new HashMap<Position, String>();
        this.vampires = new ArrayList<Vampire>();
        this.allPositions = new ArrayList<Position>();
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.length; x++) {
                this.allPositions.add(new Position(x, y));
            }
        }
        this.player = new Player(new Position(0, 0));
        this.random = new Random();

    }

    Board() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public void fillBoard() {
        this.board.clear();
        for (Position p : this.allPositions) {
            this.board.put(p, ".");
            }
                
        for (Vampire v : this.vampires) {
            this.board.put(v.getPosition(), v.getMark());
        }
        this.board.put(this.player.getPosition(), this.player.getMark());

    }
    public void printBoard() {
        for (Position p : this.allPositions) {
            if (p.getX() == 0) {
                System.out.println("");
            }
            System.out.print(this.board.get(p));
        }
    }
    
    public void printPositions() {
        System.out.println("@ " + this.player.getPosition().getX() + " " + 
                this.player.getPosition().getY());
        for (Vampire v : this.vampires) {
            System.out.println("v " + v.getPosition().getX() + " " + 
                    v.getPosition().getY());
        }
    }
    
    public void generateVampires(int number) {
        this.vampires.clear();
        for (int i = 0;i < number ; i++) {
            this.vampires.add(createRandomVampire());
        }
    }
    
    public Vampire createRandomVampire() {
        while (true) {
            Position test = new Position(this.random.nextInt(this.length), 
            this.random.nextInt(this.height));
            if (!positionPopulated(test)) {
                return new Vampire(test);
            }
        }
        
    }
    
    public boolean positionPopulated(Position p) {
        for (Vampire vamp : this.vampires) {
            if (vamp.getPosition().equals(p)) {
                return true;
            }
        }
        if (p.equals(this.player.getPosition())) {
            return true;
        }
        return false;
    }
    public int numVampires() {
        return this.vampires.size();
    }
    
    public void playTurn(String command, boolean move) {
        for (int i = 0; i < command.length(); i++) {
            this.player.move(command.substring(i, i+1), this.length, this.height); 
            ArrayList<Vampire> toRemove = new ArrayList<Vampire>();
            for (Vampire v : this.vampires) {
                if (v.getPosition().equals(this.player.getPosition())) {
                toRemove.add(v);
                }
            }
            for (Vampire v : toRemove) {
                this.vampires.remove(v);
            }
            this.fillBoard();
        }
        if (move) {
            this.generateVampires(this.numVampires());
        }
        


 
    }
    
    
    

}
