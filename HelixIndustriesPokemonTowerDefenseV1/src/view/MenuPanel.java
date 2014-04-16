package view;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import ObserverModel.Observer;


public class MenuPanel extends JPanel implements Observer {


	

	public MenuPanel() {	// constructor for the panel. Can be used to set the border and background.

		this.setBackground(Color.RED);
		
		ImageLoader loader = new ImageLoader();
		SpriteSheet overworldSheet = null;
		SpriteSheet borderSheet = null;
		try {
			overworldSheet = new SpriteSheet(loader.loadImage("Images/overworldSprites2.png"));
			borderSheet = new SpriteSheet(loader.loadImage("Images/ptdGameText.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this.setBorder(BorderFactory.createLineBorder(Color.black));
		ImageIcon icon = new ImageIcon(overworldSheet.grabSpriteAndResize(5, 733, 14, 13, 23, 20));
		//ImageIcon icon = new ImageIcon(borderSheet.grabSpriteAndResize(129, 192, 3, 8, 8, 24));

		//this.setBorder(BorderFactory.createMatteBorder(0, 9, 0, 9, icon));
		this.setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, icon));

		
		
		

	}

	// good ol' paintComponent
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	@Override
	public void update() {
		
		// we will do updates to reflect upgrades and other things here.
		
	}

}
