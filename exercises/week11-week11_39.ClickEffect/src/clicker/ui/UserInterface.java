package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        this.frame.setLayout(layout);
        
        JLabel count = new JLabel(Integer.toString(this.calc.giveValue()));
        JButton button = new JButton("Click!");
        ActionListener listener = new ClickListener(this.calc, count);
        button.addActionListener(listener);
        container.add(count);
        container.add(button);

    }

    public JFrame getFrame() {
        return frame;
    }
}
