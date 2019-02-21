package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
       frame = new JFrame("Survey");
       frame.setPreferredSize(new Dimension(500, 500));
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       createComponents(frame.getContentPane()); 
       frame.pack();
       frame.setVisible(true);
        
       
    }


    public JFrame getFrame() {
        return frame;
    }
    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        JLabel areYou = new JLabel("Are you?");
        container.add(areYou);
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);
        container.add(yes);
        container.add(no);
        JLabel why = new JLabel("Why?");
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton itIsFun = new JRadioButton("Because it is fun!");
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(itIsFun);
        JButton done = new JButton("Done!");
        container.add(why);
        container.add(noReason);
        container.add(itIsFun);
        container.add(done);
        
    }
}
