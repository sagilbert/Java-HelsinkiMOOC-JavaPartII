package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class Circle extends Figure {
    private int diameter;
    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;

    }
    public void draw(Graphics graphics) {
        graphics.fillOval(this.getX(), this.getY(), this.getDiameter(),
                this.getDiameter());
    }

    public int getDiameter() {
        return diameter;
    }
}
