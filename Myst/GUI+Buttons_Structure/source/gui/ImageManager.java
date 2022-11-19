package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Manage images which are necessary for the programm by loading and getting
 * them
 * 
 * @version 1.0
 */
public class ImageManager {

    private BufferedImage background;

    /** Load all necassary images */
    public ImageManager() {
        loadImages();
    }

    // Load all necassary images
    private void loadImages() {
        try {
            background = ImageIO.read(new File("resources/images/background.png"));
        } catch (IOException event) {
            event.printStackTrace();
        }
    }

    /** This method returns the background as BufferedImage */
    protected BufferedImage getBackground() {
        return background;
    }
}