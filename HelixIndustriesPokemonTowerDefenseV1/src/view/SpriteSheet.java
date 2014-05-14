package view;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/* This is used for importing a sprite sheet and getting sprites from it. Yeah.
 * Will Clement
 */

public class SpriteSheet {
	
	public BufferedImage spriteSheet;

	public SpriteSheet(BufferedImage sheet) {
		this.spriteSheet = sheet;
	}
	
	public BufferedImage grabSprite(int x, int y, int width, int height) {
		BufferedImage sprite = spriteSheet.getSubimage(x, y, width, height);
		return sprite;
	}
	
	public BufferedImage grabSpriteAndResize(int x, int y, int width, int height, int desiredWidth, int desiredHeight) {
		Image img = grabSprite(x, y, width, height);
		return resizeImage(img, desiredWidth, desiredHeight);
		
	}
	
	public static BufferedImage resizeImage(final Image image, int width,
			int height) {
		final BufferedImage bufferedImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		final Graphics2D graphics2D = bufferedImage.createGraphics();
		graphics2D.setComposite(AlphaComposite.Src);
		graphics2D.drawImage(image, 0, 0, width, height, null);
		graphics2D.dispose();

		return bufferedImage;
	}

	
	// THIS IS A NOTE ON HOW TO DRAW IMAGES AND RESIZE THEM. 
			/*
			 * try { img = ImageIO.read(new File("Images/doge.jpeg")); } catch
			 * (IOException e) { }
			 * 
			 * img = resizeImage(img, 40, 40);
			 */
	
}
