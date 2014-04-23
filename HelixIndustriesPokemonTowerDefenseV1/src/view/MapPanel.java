package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import towers.Tower;

import ObserverModel.Observer;

import maps.Level1;
import maps.Map;
import model.Game;
import model.Spawner;

public class MapPanel extends JPanel implements Observer {

	private Map map;
	private Game theGame;
	private BufferedImage grassBackground;
	
	
	public MapPanel(Game game) {
		this.theGame = game;
		
		Level1 current = new Level1();
		this.map = current;
		//this.map = theGame.getCurrentMap();
		
		this.setBackground(Color.cyan);
		
		this.setPreferredSize(new Dimension(map.getHeight(), map.getWidth()));
		
		ChatPanel chat = new ChatPanel(theGame);
		chat.setPreferredSize(new Dimension(150, 100));
		//this.add(chat, BorderLayout.NORTH);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage( map.getBackground(), map.getWidth(), map.getHeight(), null);
		
		g.setColor(Color.green);
		for (int i = 0; i < map.getGridWidth(); i++) {
			g.drawLine(i*map.getGridWidth(), 0, i*map.getGridWidth(), map.getGridWidth() * map.getGridWidth());
			
		}
		
		for (int j = 0; j < map.getGridHeight(); j++) {
			g.drawLine(0, j*map.getGridHeight(), map.getGridHeight()* map.getGridHeight(), j*map.getGridWidth());

		}
		
		for (int i = 0; i < map.getGridWidth(); i++) {
			for (int j = 0; j < map.getGridHeight(); j++) {
				if (map.getGrid()[i][j].hasTower()){
					g.setColor(Color.red);
					g.drawOval(i*map.getGridWidth(), j*map.getGridHeight(), map.getGridWidth(), map.getGridHeight());
				}
				
				if (map.getGrid()[i][j].hasMob()) {
					if (map.getGrid()[i][j].getMobs().size() > 1)
						g.setColor(Color.cyan);
					else
						g.setColor(Color.blue);
					g.drawOval(i*map.getGridWidth(), j*map.getGridHeight(), map.getGridWidth(), map.getGridHeight());
						
				}
				
				if (map.getGrid()[i][j].getSpawnerTile() != null) {
					g.setColor(Color.yellow);
					g.drawOval(i*map.getGridWidth(), j*map.getGridHeight(), map.getGridWidth(), map.getGridHeight());
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
	
}
