package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        createComponents(frame.getContentPane());
        frame.setVisible(true);
        
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField topText = new JTextField("I was copied herefrom the JTextArea");
        JLabel bottomText = new JLabel();
        
        JButton copyButton = new JButton("Copy!");
        ActionEventListener listener = new ActionEventListener(topText, bottomText);
        copyButton.addActionListener(listener);
        
        container.add(topText);
        container.add(copyButton);
        container.add(bottomText);

        
        
    }
}
