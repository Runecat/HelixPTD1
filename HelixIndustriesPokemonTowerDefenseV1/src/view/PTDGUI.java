package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import model.Game;

public class PTDGUI extends JFrame {
	
	/* The main GUI. I am trying to develop it in such a way where all we need to pass it is the game, then it will take care of the rest.
	 * This will be an observer of the Game
	 * 
	 */
	
	
	public static void main(String[] args) {
		Game theGame = new Game();
		PTDGUI gui = new PTDGUI(theGame);
	}

	public PTDGUI(Game game) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 720);
		this.setLayout(new BorderLayout());
		this.setTitle("Helix PTD Pre-Alpha 0.1");
		
		MapPanel mapPanel = new MapPanel(game);
		mapPanel.setPreferredSize(new Dimension(800, 720));
		this.add(mapPanel, BorderLayout.LINE_START);
				
		MenuPanel menu = new MenuPanel();
		menu.setPreferredSize(new Dimension(184, 720));
		this.add(menu, BorderLayout.LINE_END);
		
		
		
		
		this.setVisible(true);
		
		

	}
	
}
