package wormgame.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.Direction;
import wormgame.domain.*;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 11, 2018
 */
public class KeyboardListener implements KeyListener {
    private Worm worm;
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            worm.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            worm.setDirection(Direction.RIGHT);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            worm.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            worm.setDirection(Direction.DOWN);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }
}
