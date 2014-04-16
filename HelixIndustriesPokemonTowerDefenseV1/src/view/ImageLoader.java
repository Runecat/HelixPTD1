package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

// This loads images, mostly for use with SpriteSheet

public class ImageLoader {

	public BufferedImage loadImage(String filePath) throws IOException {
		
		BufferedImage img = ImageIO.read(new File(filePath));
		return img;
	}
	
}
