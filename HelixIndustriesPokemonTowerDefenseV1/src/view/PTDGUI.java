package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import towers.Charmeleon;
import towers.Tower;
import towers.TowerBuilder;

import maps.Level1;
import maps.Level2;
import maps.Level3;
import maps.Map;
import model.Game;
import model.PersistenceHandler;
import model.Player;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class PTDGUI extends JFrame {

	/*
	 * The main GUI. I am trying to develop it in such a way where all we need
	 * to pass it is the game, then it will take care of the rest. This will be
	 * an observer of the Game
	 */
	IntroPanel intro;
	JPanel mapSelection;
	Game theGame;
	
	PersistenceHandler persistence;

	MapPanel currentMapPanel;
	MenuPanel menu;

	BackgroundFrame background;

	public static void main(String[] args) {
		Game theGame = new Game();
		PTDGUI gui = new PTDGUI();
	}

	public PTDGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Helix PTD Pre-Alpha 0.1");

		this.setSize(new Dimension(1000, 720));
		
		persistence = new PersistenceHandler(null);

		intro = new IntroPanel(this);

		Game game = new Game();
		this.theGame = game;

		this.add(intro);

		background = new BackgroundFrame();
		background.setLayout(new BorderLayout());
		this.setVisible(true);

	}

	public void startGame(String s) {
		this.remove(mapSelection);

		this.theGame = new Game();
		this.add(background);
		Map m = null;
		
		if (s.equals("Level 1"))
			m = new Level1(theGame);
		else if (s.equals("Level 2"))
			m = new Level2(theGame);
		else if (s.equals("Level 3"))
			m = new Level3(theGame);
		
		// MapPanel
		currentMapPanel = new MapPanel(this.theGame, m);
		
		this.theGame.addObserver(currentMapPanel);
		currentMapPanel.setPreferredSize(new Dimension(800, 720));
		background.add(currentMapPanel, BorderLayout.LINE_START);

		menu = new MenuPanel(this.theGame);
		theGame.addObserver(menu);
		menu.setPreferredSize(new Dimension(184, 720));
		background.add(menu, BorderLayout.LINE_END);
		
		this.revalidate();

	}
	
	private void loadGame(Game g) {
		

		this.theGame = g;
		this.add(background);
		Map m = null;
		
		m = g.getCurrentMap();
		
		// MapPanel
		currentMapPanel = new MapPanel(this.theGame, m);
		
		this.theGame.addObserver(currentMapPanel);
		currentMapPanel.setPreferredSize(new Dimension(800, 720));
		background.add(currentMapPanel, BorderLayout.LINE_START);

		menu = new MenuPanel(this.theGame);
		theGame.addObserver(menu);
		menu.setPreferredSize(new Dimension(184, 720));
		background.add(menu, BorderLayout.LINE_END);
		
		this.revalidate();
		
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
			for (int i = 0; i <= this.getWidth() / grass.getWidth(); i++) {
				for (int j = 0; j <= this.getHeight() / grass.getHeight(); j++) {

					g.drawImage(grass, i * grass.getWidth(),
							j * grass.getHeight(), null);

				}
			}

		}
	}

	private class IntroPanel extends JPanel {

		private JPanel mapSelection;
		private PTDGUI gui;

		public IntroPanel(PTDGUI gui) {
			this.gui = gui;
			this.setOpaque(true);
			this.setVisible(true);
			this.setBackground(Color.RED);
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridwidth = 3;
			c.gridx = 0;
			c.gridy = 0;
			this.add(new JLabel(
					"Helix Industries Pokemon Tower Defense Pre-Alpha"), c);

			IntroListener introListener = new IntroListener();
			
			JButton single = new JButton("Single Player");
			single.addActionListener(introListener);
			JButton multi = new JButton("Multi Player");
			multi.addActionListener(introListener);
			
			JButton load = new JButton("Load Game");
			load.addActionListener(introListener);

			c.gridx = 1;
			c.gridy = 1;
			this.add(single, c);

			c.gridx = 2;
			c.gridy = 2;
			this.add(multi, c);
			
			c.gridx = 3;
			c.gridy = 3;
			this.add(load, c);

		}
		
		

		private void singlePlayerSelected() {
			mapSelection = new JPanel();
			mapSelection.setLayout(new GridLayout(3, 1));
			gui.mapSelection = mapSelection;
			
			MapListener mapListener = new MapListener();

			JButton map1 = new JButton("Map 1");
			map1.addActionListener(mapListener);
			JButton map2 = new JButton("Map 2");
			map2.addActionListener(mapListener);
			JButton map3 = new JButton("Map 3");
			map3.addActionListener(mapListener);

			mapSelection.add(map1);
			mapSelection.add(map2);
			mapSelection.add(map3);
			
			gui.remove(intro);
			gui.add(mapSelection);
			gui.revalidate();
			

		}
		
		private class IntroListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton selected = (JButton) e.getSource();
				
				if (selected.getText() == "Single Player"){
					singlePlayerSelected();
				}
				
				
				
				if (selected.getText() == "Load Game") {
					persistence.read();
					Game temp = persistence.getLoaded();
					gui.loadGame(persistence.getLoaded());
				}
			}
			
			
		}

		private class MapListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JButton selected = (JButton) arg0.getSource();

				if (selected.getText() == "Map 1")
					startGame("Level 1");
				if (selected.getText() == "Map 2")
					startGame("Level 2");
				if (selected.getText() == "Map 3")
					startGame("Level 3");
			}

		}

	}

}
