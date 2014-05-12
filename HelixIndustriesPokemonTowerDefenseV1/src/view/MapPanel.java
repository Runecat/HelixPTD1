package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import towers.Charmander;
import towers.Tower;
import towers.TowerBuilder;
import towers.TowerID;

import ObserverModel.PanelObserver;

import maps.Level1;
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

	public MapPanel(Game game) {
		this.theGame = game;

		Level1 current = new Level1(theGame);
		this.currentMap = current;

		background = currentMap.getBackground().getScaledInstance(480, -1, -1);

		this.setOpaque(false);

		this.setPreferredSize(new Dimension(currentMap.getHeight(), currentMap
				.getWidth()));

		ClickListener clicky = new ClickListener();
		this.addMouseListener(clicky);

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
					g.setColor(Color.green);
					g.fillOval(i * TILE_DIMENSION, j * TILE_DIMENSION,
							TILE_DIMENSION, TILE_DIMENSION);
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

				if (currentMap.getGrid()[i][j].hasMob()) {
					if (currentMap.getGrid()[i][j].getMobs().size() > 1)
						g.setColor(Color.cyan);
					else
						g.setColor(Color.blue);

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

	@Override
	public void update() {
		// This is where we will repaint the map and other things;
		this.repaint();

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

				theGame.setIsPlacingTower(false);
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
