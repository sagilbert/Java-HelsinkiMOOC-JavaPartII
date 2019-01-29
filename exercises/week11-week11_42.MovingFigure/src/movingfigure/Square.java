package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class Square extends Figure{
    private int sideLength;
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;

    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(),
                this.getSideLength(), this.getSideLength());
    }

    public int getSideLength() {
        return this.sideLength;
    }

}
