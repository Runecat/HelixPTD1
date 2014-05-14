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

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import towers.Charmander;
import towers.Tower;
import towers.TowerBuilder;
import towers.TowerID;
import Mob.Mob;
import ObserverModel.PanelObserver;
import maps.Level1;
//import maps.Level2;
//import maps.Level3;
import maps.Map;
import model.Game;
import model.Spawner;
import model.Tile;

public class MapPanel extends JPanel implements PanelObserver {

	private Map currentMap;
	private Game theGame;
	private BufferedImage grassBackground;
	Image background;
	private final int TILE_DIMENSION = 24;
	
	JPanel pausePanel = new JPanel();
	JTextArea pause;
	
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
		
		pause = new JTextArea("PAUSED\n" +
				"aasdfasdfasdfasdfasdfasdfsadfsa\n" +
				"asdfasdfasdfasdfasdfasdfsa\n" +
				"asdfasdfasdfasdfasdfasdfsdfsa" +
				"asdfasdfsadfasdfsadfsadfsdf");
		
		pausePanel.add(pause);
		pause.setOpaque(true);
		//pausePanel.setSize(new Dimension(300,300));
		
		MenuListener menuListener = new MenuListener();
		
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

		g.setColor(Color.green);
		for (int i = 0; i < currentMap.getWidth(); i++) {
			g.drawLine(i * TILE_DIMENSION, 0, i * TILE_DIMENSION,
					TILE_DIMENSION * currentMap.getHeight());
		}

		for (int j = 0; j < currentMap.getHeight(); j++) {
			g.drawLine(0, j * TILE_DIMENSION,
					TILE_DIMENSION * currentMap.getWidth(), j * TILE_DIMENSION);

		}

		for (int i = 0; i < currentMap.getWidth(); i++) {
			for (int j = 0; j < currentMap.getHeight(); j++) {
				String count = "" + currentMap.getGrid()[i][j].getMobs().size();
				if (currentMap.getGrid()[i][j].isOnPath()) {
					g.setColor(Color.yellow);
					g.drawRect(i * TILE_DIMENSION, j * TILE_DIMENSION,
							TILE_DIMENSION, TILE_DIMENSION);
				}
				if (currentMap.getGrid()[i][j].getMobs().size() != 0) {
					for(Mob m: currentMap.getGrid()[i][j].getMobs())
					{
						g.drawImage(m.getImage(),i * TILE_DIMENSION, j
								* TILE_DIMENSION, TILE_DIMENSION,
								TILE_DIMENSION, this);
					}
				}
				g.setColor(Color.BLACK);
				// g.drawString("" + count, (i)*currentMap.getGridWidth(),
				// (j+1)*currentMap.getGridHeight());
				g.drawString("" + count, (i) * TILE_DIMENSION + 6, (j + 1)
						* TILE_DIMENSION - 5);

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
		this.revalidate();
	}
	

	@Override
	public void update() {
		// This is where we will repaint the map and other things;
		if (theGame.hasLost())
			loseMessage();
		
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
			else if (theGame.getIsPlacingTower() == false && theGame.canPlaceTower(x, y)){
				theGame.setCurrentTowerInfo(null);
				theGame.notifyObservers();
			}
			else {
				theGame.setCurrentTowerInfo((Tower) currentMap.getObject(x, y));
				theGame.notifyObservers();
			}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
	
	

}
