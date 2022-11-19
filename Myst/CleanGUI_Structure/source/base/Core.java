package base;

import gui.Frame;
import gui.Panel;

/**
 * The starting point of the programm
 * 
 * @version 1.1
 * @author MrMystery10-del
 */
public class Core {

    private Panel panel;

    private short panelWidth = 1200;
    private short panelHeight = 800;

    // Programm start
    public static void main(String[] args) {
        new Core();
    }

    // Non-static instance for running non-static methods
    public Core(){
        createGUI();
        repaintLoop();
    }

    // This method creates the GUI
    private void createGUI() {
        panel = new Panel(panelWidth, panelHeight);
        new Frame(panelWidth, panelHeight, panel);
    }

    // This method is a infinity loop to repaint the screen with around 60 FPS (Only works when something on the GUI happens)
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