package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class CompoundFigure extends Figure {   
    private ArrayList<Figure> figureList;

    public CompoundFigure() {
        super(0, 0);
        this.figureList = new ArrayList<Figure>();
        

    }
    public void add(Figure f) {
        this.figureList.add(f);
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure f : figureList) {
            f.move(dx, dy);
        }
    }
    public void draw(Graphics graphics) {
        for (Figure f : figureList) {
            f.draw(graphics);
        }
    }
}
