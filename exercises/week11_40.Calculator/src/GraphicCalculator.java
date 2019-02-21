
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        
        JTextField input = new JTextField();

        GridLayout buttonLayout = new GridLayout(1, 3);
        JPanel buttons = new JPanel(buttonLayout);
        
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");        
        JButton clearButton = new JButton("Z"); 
        
        plusButton.addActionListener(new plusButtonListener(input, output, clearButton));
        minusButton.addActionListener(new minusButtonListener(input, output, clearButton));
        clearButton.addActionListener(new clearButtonListener(input, output, clearButton));
        
        buttons.add(plusButton);
        buttons.add(minusButton);
        buttons.add(clearButton);

        container.add(output);
        container.add(input);
        container.add(buttons);

        
    }

    public JFrame getFrame() {
        return frame;
    }
}
