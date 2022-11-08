package gui;

import java.awt.Graphics2D;

/** 
 * This class is used for graphics2D
 * 
 * @version 1.0 
 */
public class Draw {

    private ImageManager imageManager = new ImageManager();

    /** Is used to draw the whole gui */
    public Draw(Graphics2D graphics2D) {
        drawBase(graphics2D);
        drawAnimation(graphics2D);
        drawText(graphics2D);
    }

    public void draw(Graphics2D g){
        drawBase(g);
    }

    // This method draws the base of the GUI. For example: background
    private void drawBase(Graphics2D g2d) {

        g2d.drawImage(imageManager.getBackground(), 0, 0, 1200, 800, null);
    }

    // This method draws the animation of the GUI.
    private void drawAnimation(Graphics2D g2d) {

    }

    // This method draws the text of the GUI.
    private void drawText(Graphics2D g2d) {

    }
}
