package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import ObserverModel.Observer;

import model.Game;
import model.Map;

public class MapPanel extends JPanel implements Observer {

	private Map map;
	private Game theGame;
	
	public MapPanel(Game game) {
		this.theGame = game;
		this.map = theGame.getMap();
		
		this.setBackground(Color.cyan);
		
		ChatPanel chat = new ChatPanel(theGame);
		chat.setPreferredSize(new Dimension(150, 100));
		this.add(chat, BorderLayout.NORTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void update() {
		// This is where we will repaint the map and other things;
		
	}
	
}
