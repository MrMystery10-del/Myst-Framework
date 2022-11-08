package base;

import gui.Frame;
import gui.Panel;

/**
 * The Main core of the program
 * 
 * @version 1.0
 * @author MrMystery10-del
 */
public class Core {

    Panel panel;

    /** This is the core of the game where the logic is */
    public Core() {
        createGUI();
        repaintLoop();
    }

    // This method creates the GUI
    private void createGUI() {
        short width = 1200;
        short height = 800;
        panel = new Panel(width, height);
        new Frame(width, height, new Panel(width, height));
    }

    // This method is a infinity loop to repaint the screen with around 60 FPS
    private void repaintLoop() {
        new Thread(new Runnable() {
            public void run() {
                for (;;) {
                    try {
                        Thread.sleep(17);
                        panel.repaint();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
