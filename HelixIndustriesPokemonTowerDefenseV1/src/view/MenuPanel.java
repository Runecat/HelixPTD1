package view;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import towers.TowerID;

import model.Game;

import ObserverModel.PanelObserver;


public class MenuPanel extends JPanel implements PanelObserver {


	Game theGame;

	public MenuPanel(Game theGame) {	// constructor for the panel. Can be used to set the border and background.

		this.setBackground(Color.RED);
		this.setLayout(new GridLayout(4,1));
		this.add(new JButton("Start Game!"));
		
		// towerSelectPanel
		JPanel towerSelectPanel = new JPanel();
		towerSelectPanel.setLayout(new FlowLayout());
		TowerSelectListener buttonListener = new TowerSelectListener();
		
		JButton charmanderButton = new JButton("Charmander");
		charmanderButton.addActionListener(buttonListener);
		towerSelectPanel.add(charmanderButton);
		
		JButton charmeleonButton = new JButton("Charmeleon");
		charmeleonButton.addActionListener(buttonListener);
		towerSelectPanel.add(charmeleonButton);		
		this.add(towerSelectPanel);
		// end towerSelectPanel

		this.theGame = theGame;
		
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
		
		//g.fillOval(50, 50, 300, 300);
		g.drawString("$: " + theGame.getPlayers().get(0).getMoney(), 50, 100);

	}

	@Override
	public void update() {
		
		// we will do updates to reflect upgrades and other things here.
		repaint();
	}

	private class TowerSelectListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton buttonClicked = (JButton) arg0.getSource();
			
			if (buttonClicked.getText().equals("Charmander")){
				theGame.setCurrentTowerSelected(TowerID.CHARMANDER);
			}
			if (buttonClicked.getText().equals("Charmeleon")) {
				theGame.setCurrentTowerSelected(TowerID.CHARMELEON);
			}
			
			theGame.setIsPlacingTower(true);

		}
		
	}
}
