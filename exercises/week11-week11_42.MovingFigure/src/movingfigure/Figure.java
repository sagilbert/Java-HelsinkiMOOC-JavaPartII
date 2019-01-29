package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public abstract void draw(Graphics graphics);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
