package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 5, 2018
 */
public class DrawingBoard extends JPanel{
    private Figure figure;
    public DrawingBoard(Figure figure) {
        super.setBackground(Color.WHITE);
        this.figure = figure;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.figure.draw(g);
    }
}
