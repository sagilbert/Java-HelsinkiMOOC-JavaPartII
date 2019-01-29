package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;
/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class PersonalBoard extends GameOfLifeBoard{

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        try {
            this.getBoard()[x][y] = true;
        } catch(Exception e) {
            ;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        try {
            this.getBoard()[x][y] = false;
        } catch(Exception e) {
            ;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        try {
            return this.getBoard()[x][y];
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random random = new Random();
        double randVal;
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                randVal = random.nextDouble();
                if (randVal < probabilityForEachCell) {
                    this.getBoard()[x][y] = true;
                } else {
                    this.getBoard()[x][y] = false;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        int[] xVals = new int[] {x, x+1, x-1};
        int[] yVals = new int[] {y, y+1, y-1};
        for (int i : xVals) {
            for (int j : yVals) {
                if (!(i == x && j == y)) {
                    try {
                        if (this.isAlive(i, j)) {
                            count++;
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
        }
        return count;
        
         
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2) {
            this.getBoard()[x][y] = false;
        } else if (livingNeighbours > 3) {
            this.getBoard()[x][y] = false;
        } else if (livingNeighbours == 3) {
            this.getBoard()[x][y] = true;
        }
    }
    
}
