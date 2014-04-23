package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import model.Game;

public class PTDGUI extends JFrame {
	
	/* The main GUI. I am trying to develop it in such a way where all we need to pass it is the game, then it will take care of the rest.
	 * This will be an observer of the Game
	 * 
	 */
	
	MapPanel mapPanel;
	
	BackgroundFrame background;
	
	public static void main(String[] args) {
		Game theGame = new Game();
		PTDGUI gui = new PTDGUI(theGame);
	}

	public PTDGUI(Game game) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 720);
		this.setTitle("Helix PTD Pre-Alpha 0.1");
		
		background = new BackgroundFrame();
		background.setLayout(new BorderLayout());
		this.add(background);
		
		//MapPanel 
		mapPanel = new MapPanel(game);
		mapPanel.setPreferredSize(new Dimension(800, 720));
		background.add(mapPanel, BorderLayout.LINE_START);
				
		MenuPanel menu = new MenuPanel();
		menu = new MenuPanel();
		menu.setPreferredSize(new Dimension(184, 720));
		background.add(menu, BorderLayout.LINE_END);
		

		
		
		this.setVisible(true);
		Timer time = new Timer(1, new GameTimeListener());
		time.start();
		
		
		

	}
	
	private class GameTimeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			mapPanel.update();
		}
		
		
	}
	
	
	
	private class BackgroundFrame extends JPanel {
		ImageLoader loader = new ImageLoader();
		BufferedImage grass;
		
		public BackgroundFrame() {
			try {
				grass = loader.loadImage("Images/GrassIsForMowin.png");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i <= this.getWidth()/grass.getWidth(); i++) {
				for (int j = 0; j <= this.getHeight()/grass.getHeight(); j++){
					
					g.drawImage(grass, i*grass.getWidth(), j*grass.getHeight(), null);
					
				}
			}
			
		}
	}
	
}
