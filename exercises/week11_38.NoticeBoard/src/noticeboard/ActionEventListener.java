package noticeboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Samuel Gilbert
 * Date: Nov 29, 2018
 */
public class ActionEventListener implements ActionListener{
    private JTextField topText;
    private JLabel bottomText;

    public ActionEventListener(JTextField topText, JLabel bottomText) {
        this.topText = topText;
        this.bottomText = bottomText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.bottomText.setText(this.topText.getText());
        this.topText.setText("");
    }
    
}
