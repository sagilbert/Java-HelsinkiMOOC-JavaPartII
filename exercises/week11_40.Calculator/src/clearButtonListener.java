
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 3, 2018
 */
public class clearButtonListener implements ActionListener{
    private JTextField input;
    private JTextField output;
    private JButton button;
    public clearButtonListener(JTextField input, JTextField output, JButton button ) {
        this.input = input;
        this.output = output;
        this.button = button;
        this.button.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.button.isEnabled()) {
            this.input.setText("");
            this.output.setText("0");
            this.button.setEnabled(false);
        }
        
    
    }
    
}
