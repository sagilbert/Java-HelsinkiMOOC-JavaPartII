package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 30, 2018
 */
public class ClickListener implements ActionListener {
    private Calculator calc;
    private JLabel text;

    public ClickListener(Calculator calc, JLabel text) {
        this.calc = calc;
        this.text = text;
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        text.setText(Integer.toString(calc.giveValue()));
    }
    
}
