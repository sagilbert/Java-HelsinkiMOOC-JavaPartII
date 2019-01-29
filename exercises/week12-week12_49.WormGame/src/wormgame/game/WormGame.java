package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.*;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.generateApple();
    }
    public void generateApple() {
        Random random = new Random();
        this.apple = new Apple(random.nextInt(width), random.nextInt(height));
        if (worm.runsInto(apple)) {
            generateApple();
        }
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            this.generateApple();
        }
        if (worm.runsIntoItself()) {
            continues = false;
        } else if (worm.wormHead().getX() == this.width || worm.wormHead().getX() < 0) {
            continues = false;
        } else if (worm.wormHead().getY() == this.height || worm.wormHead().getY() < 0) {
            continues = false;
        }
        this.updatable.update();
        
        setDelay(1000 / worm.getLength());
        if (!continues) {
            return;
        }

    }
    public Worm getWorm() {
        return this.worm;
    }
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    public Apple getApple() {
        return this.apple;
    }
    public void setApple(Apple apple) {
        this.apple = apple;
    }

}
