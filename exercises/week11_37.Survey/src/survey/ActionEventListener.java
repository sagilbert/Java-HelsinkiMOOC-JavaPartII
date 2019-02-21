package survey;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Samuel Gilbert
 * Date: Nov 29, 2018
 */
public class ActionEventListener implements ActionListener{

    public ActionEventListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("The Button Worked!");
    }
    
}
