package gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * The MainScreen class extends a JPanel, is used as main
 * root for all GUI stuff
 * 
 * @version 1.0
 */
public class Panel extends JPanel {

    /** Constructs the JPanel */
    public Panel(short width, short height) {
        setPanelAttribute(width, height);
        createComponents();
    }

    // This method sets all JPanel attributes
    private void setPanelAttribute(short width, short height) {
        setPreferredSize(new Dimension(width, height));
        setLayout(null);

        setBackground(Color.WHITE);
    }

    // This method is used to create components from myst blueprints or basic swing
    private void createComponents() {
    
    }

    // This method is the root for all drawing on the JPanel
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        new Draw(graphics2D);
    }
}