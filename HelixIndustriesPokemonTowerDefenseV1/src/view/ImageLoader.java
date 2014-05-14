package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

// This loads images, mostly for use with SpriteSheet

public class ImageLoader {

	public BufferedImage loadImage(String filePath) throws IOException {
		
		BufferedImage img = ImageIO.read(new File(filePath));
		return img;
	}
	
}
