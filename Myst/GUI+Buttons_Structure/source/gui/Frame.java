package gui;

import javax.swing.JFrame;

/**
 * The Frame class extends a JFrame which adds the Panel to the
 * Frame
 * 
 * @version 1.0
 */
public class Frame extends JFrame {

    /** Construct the base Frame */
    public Frame(short width, short height, Panel screen1) {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Framework base structure by MrMystery10-del");
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(screen1);
        pack();
        setVisible(true);
    }
}