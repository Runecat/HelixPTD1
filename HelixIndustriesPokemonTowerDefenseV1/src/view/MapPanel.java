package view;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import towers.Tower;
import Mob.Mob;
import ObserverModel.PanelObserver;
import maps.Map;
import model.Game;
import model.Tile;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class MapPanel extends JPanel implements PanelObserver, Serializable {

	private Map currentMap;
	private Game theGame;
	private BufferedImage grassBackground;
	Image background;
	private final int TILE_DIMENSION = 24;
	
	JPanel pausePanel = new JPanel();
	JTextArea pause;
	JButton saveButton;
	
	JPanel winPanel = new JPanel();
	JTextArea winMessage;
	
	JPanel losePanel = new JPanel();
	JTextArea loseMessage;

	JButton quit;
	
	public MapPanel(Game game, Map m) {
		this.theGame = game;

		this.currentMap = m;

		background = currentMap.getBackground().getScaledInstance(currentMap.getOffset(), -1, -1);
		
		buildPanels();
		
		

		this.setOpaque(false);

		this.setPreferredSize(new Dimension(currentMap.getHeight(), currentMap
				.getWidth()));

		ClickListener clicky = new ClickListener();
		this.addMouseListener(clicky);

	}
	
	public void buildPanels() {
		
		MenuListener menuListener = new MenuListener();

		
		pause = new JTextArea("PAUSED\n" +
				"Welcome to Helix Industries Pokemon Tower Defense!\n" +
				"You lose when your health hits 0, one health lost per enemy that gets there\n" +
				"Click on the appropriate button on the right and then a blank space to build towers.\n" +
				"Win by defeating all 50 waves.\n"+
				"(You cannot build towers on the enemy path)  Good Luck!\n");
		saveButton = new JButton("Save and quit");
		saveButton.addActionListener(menuListener);
		
		pausePanel.add(pause);
		pausePanel.add(saveButton);
		pause.setOpaque(true);
		
		
		winMessage = new JTextArea("You have won. You make me proud.");
		loseMessage = new JTextArea("FAILURE.");
		quit = new JButton("Quit game");
		quit.addActionListener(menuListener);
		
		pausePanel.add(quit);
		
		winPanel.add(winMessage);
		winPanel.add(quit);
		
		losePanel.add(loseMessage);
		losePanel.add(quit);
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		

		g.drawImage(background, 0, 0, null);

		//
		for (int i = 0; i < currentMap.getWidth(); i++) {
			for (int j = 0; j < currentMap.getHeight(); j++) {
				String count = "" + currentMap.getGrid()[i][j].getMobs().size();
				if (currentMap.getGrid()[i][j].getMobs().size() != 0) {
					for(Mob m: currentMap.getGrid()[i][j].getMobs())
					{
						g.drawImage(m.getImage(),i * TILE_DIMENSION, j
								* TILE_DIMENSION, TILE_DIMENSION,
								TILE_DIMENSION, this);
					}
				}

			}
		}

		for (int i = 0; i < currentMap.getWidth(); i++) {
			for (int j = 0; j < currentMap.getHeight(); j++) {
				if (currentMap.getGrid()[i][j].hasTower()) {

					Tower temp = (Tower) currentMap.getGrid()[i][j].getObject();// possible
																				// problems
					g.drawImage(temp.getImage(), i * TILE_DIMENSION - 10, j
							* TILE_DIMENSION - 10, TILE_DIMENSION + 20,
							TILE_DIMENSION + 20, this);
				}

				if (currentMap.getGrid()[i][j].hasMob())
				{
					for(Mob mob: currentMap.getGrid()[i][j].getMobs())
					{
						mob.resetImage();
						g.drawImage(mob.getImage(), i * TILE_DIMENSION, j
								* TILE_DIMENSION, TILE_DIMENSION,
								TILE_DIMENSION, this);
			  			
					}

				}
				
				if (theGame.getCurrentTowerInfo() != null) {
					for (Tile t : theGame.getCurrentTowerInfo().getRange()) {
						g.setColor(Color.RED);
						g.drawRect(t.getX() * TILE_DIMENSION, t.getY() * TILE_DIMENSION, TILE_DIMENSION, TILE_DIMENSION);
					}
					repaint();
				}

				if (currentMap.getGrid()[i][j].getSpawnerTile() != null) {
					g.setColor(Color.yellow);
				}

			}
		}
		
		
		
		

	}

	public void drawBackground(Graphics g) {
		g.drawImage(grassBackground, 5, 5, null);
	}
	
	public void addPausePanel() {
		pausePanel.add(pause);

		if (this.getComponentCount() == 0)
		this.add(pausePanel);
	}
	
	public void removePausePanel() {
		pausePanel.add(pause);

		if (this.getComponentCount() != 0)
		this.remove(pausePanel);
	}
	
	public void loseMessage() {
		this.remove(pausePanel);
		this.add(losePanel);
		theGame.saveGame();
		this.revalidate();
	}
	
	public void winMessage() {
		this.remove(pausePanel);
		this.add(winPanel);
		this.revalidate();
	}
	

	@Override
	public void update() {
		// This is where we will repaint the map and other things;
		if (theGame.hasLost())
			loseMessage();
		
		if (theGame.hasWon())
			winMessage();
		
		if (theGame.isPaused() && !theGame.betweenRounds()) {
			addPausePanel();
		}
		else
			removePausePanel();
		
		pausePanel.revalidate();
		
		this.repaint();

	}
	
	private class MenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton selected = (JButton) arg0.getSource();
			
			
			
			if (selected.getText().equals("Quit game")){
				System.exit(0);
			}
			
			if (selected.getText().equals("Save and quit")){
				theGame.saveGame();
				System.exit(0);
			}
			
		}
		
		
	}

	private class ClickListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {

			// int x = arg0.getX()/currentMap.getWidth();
			// int y = arg0.getY()/currentMap.getHeight();
			int x = arg0.getX() / TILE_DIMENSION;
			int y = arg0.getY() / TILE_DIMENSION;
			if (theGame.canPlaceTower(x, y) && theGame.getIsPlacingTower()) {
				theGame.createTower(x, y, theGame.getCurrentTowerSelected());
				theGame.setCurrentTowerInfo((Tower) currentMap.getObject(x, y));
				theGame.setIsPlacingTower(false);
				theGame.notifyObservers();
			}
			else if (!theGame.getIsPlacingTower() && theGame.getCurrentMap().getTile(x, y).isOnPath() && theGame.getCurrentMap().getTile(x, y).getMobs().size() != 0) {
				theGame.setCurrentTowerInfo(null);
				theGame.setCurrentMobsInfo(currentMap.getTile(x, y).getMobs());
				theGame.notifyObservers();
			}
			else if (theGame.getIsPlacingTower() == false && theGame.canPlaceTower(x, y)){
				theGame.setCurrentTowerInfo(null);
				theGame.setCurrentMobsInfo(null);
				theGame.notifyObservers();
			}
			else if (theGame.getIsPlacingTower() == false && theGame.getCurrentMap().getTile(x, y).isOnPath()){
				theGame.setCurrentTowerInfo(null);
				theGame.setCurrentMobsInfo(null);
				theGame.notifyObservers();
			}
			else {
				theGame.setCurrentTowerInfo((Tower) currentMap.getObject(x, y));
				theGame.notifyObservers();
			}
			
		}

		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}
	
	

}
