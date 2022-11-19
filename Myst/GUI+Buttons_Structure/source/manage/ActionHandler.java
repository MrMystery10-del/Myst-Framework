package manage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.HashMap;
import java.util.function.Consumer;

import javax.swing.JButton;

/**
 * The ActionHandler class implements the ActionListener interface, this class
 * can be added to any JComponent
 * to detect event and perform a action based on the event source
 * 
 * @version 1.0
 */
public class ActionHandler implements ActionListener {

    private HashMap<JButton, Consumer<ActionEvent>> buttons;

    /** Adds the event source to the ActionListener to able detection on events */
    public ActionHandler(HashMap<JButton, Consumer<ActionEvent>> buttons) {
        this.buttons = buttons;
    }

    // This method gets performed on event
    @Override
    public void actionPerformed(ActionEvent event) {
        buttons.get(event.getSource()).accept(event);
    }

}
