package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import ObserverModel.Observer;

import maps.Map;
import model.Game;

public class MapPanel extends JPanel implements Observer {

	private Map map;
	private Game theGame;
	private BufferedImage grassBackground;
	
	
	public MapPanel(Game game) {
		this.theGame = game;
		this.map = theGame.getMap();
		
		this.setBackground(Color.cyan);
		
		this.setPreferredSize(new Dimension(map.getHeight(), map.getWidth()));
		
		ChatPanel chat = new ChatPanel(theGame);
		chat.setPreferredSize(new Dimension(150, 100));
		//this.add(chat, BorderLayout.NORTH);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
	}
	
	public void drawBackground(Graphics g) {
		g.drawImage(grassBackground, 5, 5, null);
	}

	@Override
	public void update() {
		// This is where we will repaint the map and other things;
		
	}
	
}
