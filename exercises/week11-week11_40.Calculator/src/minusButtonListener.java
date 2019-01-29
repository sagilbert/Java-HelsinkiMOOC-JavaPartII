
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 3, 2018
 */
public class minusButtonListener implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton clearButton;
    
    public minusButtonListener(JTextField input, JTextField output, JButton clearButton) {
        this.input = input;
        this.output = output;
        this.clearButton = clearButton;
    }
    public void actionPerformed(ActionEvent e) {
        try {
            int in = Integer.parseInt(this.input.getText());
            int out = Integer.parseInt(this.output.getText());
            int newOut = out - in;
            this.output.setText(Integer.toString(newOut));
            this.input.setText("");
            if (this.output.getText().equals("0")) {
                this.clearButton.setEnabled(false);
            } else {
                this.clearButton.setEnabled(true);
            }
        } catch (NumberFormatException NumberFormatException) {
            this.input.setText(""); 
        } 
           
    }

    public minusButtonListener() {

    }
}
