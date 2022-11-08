package myst.swing.blueprint;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

/**
 * The TextFieldBlueprint class is used to create JTextField from swing way faster
 * and easyer with 3 Blueprints,
 * can also get modifyed by common JTextField syntaxes.
 * This is mainly used for homework or if you school only have this auto swing
 * builders.
 * 
 * @version 1.0
 * @author Kirils Turkins / MrMystery
 */
public class TextFieldBlueprint extends JTextField {

    /**
     * Constructs a new JTextField. A model is set by the given parameters.
     */
    public TextFieldBlueprint(int x, int y, int width, int height) {

        setBounds(x, y, width, height);
        setBackground(Color.GRAY);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.BOLD, 20));
    }

    /**
     * Constructs a new JTextField. A model is set by the given parameters.
     */
    public TextFieldBlueprint(int x, int y, int width, int height, Color background, Color foreground) {

        setBounds(x, y, width, height);
        setBackground(background);
        setForeground(foreground);
        setFont(new Font("Arial", Font.BOLD, 20));
    }

    /**
     * Constructs a new JTextField. A model is set by the given parameters.
     */
    public TextFieldBlueprint(int x, int y, int width, int height, Color background, Color foreground, String font,
            String text, short textSize) {

        setBounds(x, y, width, height);
        setBackground(background);
        setForeground(foreground);
        setFont(new Font(font, Font.BOLD, textSize));
        setText(text);
    }
}