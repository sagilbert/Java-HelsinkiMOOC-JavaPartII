package dungeon;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 25, 2018
 */
import java.util.Scanner;
public class Dungeon {
    private Board board;
    private int moves;
    private Scanner reader;    
    private boolean vampiresMove;
    private int vampires;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.board = new Board(length, height);
        this.moves = moves;
        this.reader = new Scanner(System.in); 
        this.vampiresMove = vampiresMove;
        this.vampires = vampires;
    }

    public void run() {
        this.board.generateVampires(this.vampires);
        this.fillBoard();
        this.printSituation();
        while (this.moves >0) {
            String command = this.readIn();
            this.board.playTurn(command, this.vampiresMove);
            this.moves--;
            this.printSituation();
            if (this.board.numVampires() == 0) {
                System.out.println("YOU WIN");
                break;
            }
            if (this.moves == 0) {
                System.out.println("YOU LOSE");
                break;
            }

            
        }
        
    }
    public String readIn() {
        return this.reader.nextLine();
    }    
    public void printSituation() {
        System.out.println(this.moves);
        //System.out.println("Vampires: " +this.board.numVampires());
        System.out.println("");
        this.board.printPositions();
        this.board.printBoard();
        System.out.println("\n");
    }
    public void fillBoard() {
        this.board.fillBoard();
    }
    
}
