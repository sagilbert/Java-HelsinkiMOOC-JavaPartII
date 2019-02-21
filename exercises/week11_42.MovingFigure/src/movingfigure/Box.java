package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class Box extends Figure{
    private int width;
    private int height;
    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(),
                this.getWidth(), this.getHeight());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
}
