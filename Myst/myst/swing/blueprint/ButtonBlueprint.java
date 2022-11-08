package myst.swing.blueprint;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

/**
 * The ButtonBlueprint class is used to create JButtons from swing way faster
 * and easyer with 3 Blueprints,
 * can also get modifyed by common JButton syntaxes.
 * This is mainly used for homework or if you school only have this auto swing
 * builders.
 * 
 * @version 1.0
 * @author Kirils Turkins / MrMystery
 */
public class ButtonBlueprint extends JButton {

    /**
     * Constructs a new JButton. A model is set by the given parameters.
     */
    public ButtonBlueprint(int x, int y, int width, int height, ActionListener actionListener) {

        setBounds(x, y, width, height);
        setBackground(Color.GRAY);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 20));
        setFocusable(false);

        addActionListener(actionListener);
    }

    /**
     * Constructs a new JButton. A model is set by the given parameters.
     */
    public ButtonBlueprint(int x, int y, int width, int height, Color background, Color foreground,
            ActionListener actionListener) {

        setBounds(x, y, width, height);
        setBackground(background);
        setForeground(foreground);
        setFont(new Font("Arial", Font.BOLD, 20));
        setFocusable(false);

        addActionListener(actionListener);
    }

    /**
     * Constructs a new JButton. A model is set by the given parameters.
     */
    public ButtonBlueprint(int x, int y, int width, int height, Color background, Color foreground, String font,
            String text, short textSize, ActionListener actionListener) {

        setBounds(x, y, width, height);
        setBackground(background);
        setForeground(foreground);
        setFont(new Font(font, Font.BOLD, textSize));
        setText(text);
        setFocusable(false);

        addActionListener(actionListener);
    }
}