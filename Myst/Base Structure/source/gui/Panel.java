package gui;

import java.util.HashMap;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

import manage.ActionHandler;
import myst.swing.blueprint.ButtonBlueprint;

/**
 * The MainScreen class extends a JPanel, is used as main
 * root for all GUI stuff
 * 
 * @version 1.2
 */
public class Panel extends JPanel {

    /** Constructs the JPanel */
    public Panel(short width, short height) {
        setPanelAttribute(width, height);
        createButtons();
    }

    // This method sets all JPanel attributes
    private void setPanelAttribute(short width, short height) {
        setPreferredSize(new Dimension(width, height));
        setLayout(null);

        setBackground(Color.WHITE);
    }

    // This method creates buttons with consumer function
    private void createButtons() {
        HashMap<JButton, Consumer<ActionEvent>> buttonMap = new HashMap<>();
        ActionHandler actionHandler = new ActionHandler(buttonMap);
        ButtonEvents buttonEvents = new ButtonEvents();

        buttonMap.put(new ButtonBlueprint(10, 10, 200, 50, actionHandler), event -> buttonEvents.outPrintText());

        for (JButton buttons : buttonMap.keySet()) {
            add(buttons);
        }
    }

    // This method is the root for all drawing on the JPanel
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        new Draw(graphics2D);
    }
}