package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import towers.Tower;
import towers.TowerBuilder;
import towers.TowerID;

import model.Game;

import ObserverModel.PanelObserver;

public class MenuPanel extends JPanel implements PanelObserver {

	Game theGame;

	JPanel infoPanel;
	JTextArea info;
	JButton evolveButton;

	JPanel towerSelectPanel;
	JLabel money;

	JPanel startStopPanel;
	JButton startButton = new JButton("Start Game!");
	JButton pauseButton = new JButton("   Pause   ");
	JLabel time;

	TowerSelectListener buttonListener;

	public MenuPanel(Game theGame) { // constructor for the panel. Can be used
										// to set the border and background.
		this.theGame = theGame;
		this.setBackground(Color.RED);
		this.setLayout(new GridLayout(4, 1));

		buttonListener = new TowerSelectListener();

		// infoPanel
		buildInfoPanel();
		this.add(infoPanel);

		// towerSelectPanel
		buildTowerSelectPanel();
		this.add(towerSelectPanel);
		// end towerSelectPanel

		// startStopPanel
		buildStartStopPanel();
		this.add(startStopPanel);
		// end startStopPanel

		ChatPanel chat = new ChatPanel(this.theGame);
		chat.setPreferredSize(new Dimension(150, 100));
		this.add(chat);

		ImageLoader loader = new ImageLoader();
		SpriteSheet overworldSheet = null;
		SpriteSheet borderSheet = null;
		try {
			overworldSheet = new SpriteSheet(
					loader.loadImage("Images/overworldSprites2.png"));
			borderSheet = new SpriteSheet(
					loader.loadImage("Images/ptdGameText.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this.setBorder(BorderFactory.createLineBorder(Color.black));
		ImageIcon icon = new ImageIcon(overworldSheet.grabSpriteAndResize(5,
				733, 14, 13, 23, 20));
		// ImageIcon icon = new ImageIcon(borderSheet.grabSpriteAndResize(129,
		// 192, 3, 8, 8, 24));

		// this.setBorder(BorderFactory.createMatteBorder(0, 9, 0, 9, icon));
		this.setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, icon));
	}

	public void buildInfoPanel() {
		infoPanel = new JPanel();
		info = new JTextArea();
		info.setEditable(false);
		infoPanel.add(new JLabel("Info:\n"));
		infoPanel.add(info);
		evolveButton = new JButton("Evolve!");
		evolveButton.addActionListener(buttonListener);
	}

	public void buildTowerSelectPanel() {
		towerSelectPanel = new JPanel();
		towerSelectPanel.setLayout(new FlowLayout());

		money = new JLabel("Moneys: $" + theGame.getPlayer(0).getMoney());
		towerSelectPanel.add(money);

		JButton charmanderButton = new JButton("Charmander");
		charmanderButton.addActionListener(buttonListener);
		towerSelectPanel.add(charmanderButton);

		JButton bulbasaurButton = new JButton("Bulbasaur");
		bulbasaurButton.addActionListener(buttonListener);
		towerSelectPanel.add(bulbasaurButton);

		JButton pikachuButton = new JButton("Pikachu");
		pikachuButton.addActionListener(buttonListener);
		towerSelectPanel.add(pikachuButton);

	}

	private void buildStartStopPanel() {
		startStopPanel = new JPanel();
		pauseButton.addActionListener(buttonListener);
		startButton.addActionListener(buttonListener);
		startStopPanel.add(startButton);
		time = new JLabel("Time: " + theGame.getTime());
		startStopPanel.add(time);
	}

	public void menuPanelUpdate() {
		money.setText("Moneys: $" + theGame.getPlayer(0).getMoney());
		time.setText("Time: " + theGame.getTime());
		if (theGame.getCurrentTowerInfo() != null) {
			info.setText("  "
					+ theGame.getCurrentTowerInfo().getName()
					+ "  "
					+ "\n"
					+ "Attacks: "
					+ theGame.getCurrentTowerInfo().getAttacks().get(0)
							.getName());
			if (theGame.getCurrentTowerInfo().getUpgraded() != null) {
				infoPanel.add(evolveButton);
			} else
				infoPanel.remove(evolveButton);
		} else {
			info.setText("");
			infoPanel.remove(evolveButton);
		}
	}

	// good ol' paintComponent
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// g.fillOval(50, 50, 300, 300);
		g.drawString("$: " + theGame.getPlayers().get(0).getMoney(), 50, 100);

	}

	@Override
	public void update() {

		// we will do updates to reflect upgrades and other things here.
		menuPanelUpdate();
		repaint();
		startStopPanel.repaint();

	}

	private class TowerSelectListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton buttonClicked = (JButton) arg0.getSource();

			if (buttonClicked.getText().equals("Charmander")) {
				if (canAfford(TowerID.CHARMANDER)) {
					theGame.setCurrentTowerSelected(TowerID.CHARMANDER);
					theGame.setIsPlacingTower(true);
				} else
					JOptionPane.showMessageDialog(new Frame(),
							"Can't Afford That!");
			}
			if (buttonClicked.getText().equals("Bulbasaur")) {
				if (canAfford(TowerID.BULBASAUR)) {
					theGame.setCurrentTowerSelected(TowerID.BULBASAUR);
					theGame.setIsPlacingTower(true);
				} else
					JOptionPane.showMessageDialog(new Frame(),
							"Can't Afford That!");
			}

			if (buttonClicked.getText().equals("Pikachu")) {
				if (canAfford(TowerID.PIKACHU)) {
					theGame.setCurrentTowerSelected(TowerID.PIKACHU);
					theGame.setIsPlacingTower(true);
				} else
					JOptionPane.showMessageDialog(new Frame(),
							"Can't Afford That!");
			}

			if (buttonClicked.getText().equals("Start Game!")) {
				switchButtons(buttonClicked.getText());
				theGame.startTimer();
			}

			if (buttonClicked.getText().equals("   Pause   ")) {
				switchButtons(buttonClicked.getText());
				theGame.stopTimer();
			}

			if (buttonClicked.getText().equals("Evolve!")) {
				if (!theGame.isPaused()) {
					if (theGame.getPlayer(0).getMoney() >= theGame
							.getCurrentTowerInfo().getUpgraded().getBuy()) {
						theGame.getPlayer(0).addMoney(
								-1
										* theGame.getCurrentTowerInfo()
												.getUpgraded().getBuy());
						Tower temp = theGame.getCurrentTowerInfo()
								.getUpgraded();
						theGame.getCurrentTowerInfo().upgradeTower();
						theGame.setCurrentTowerInfo(temp);
						theGame.notifyObservers();
					} else
						JOptionPane.showMessageDialog(new Frame(),
								"Can't Afford That!");
				}
			}

		}

		public boolean canAfford(TowerID id) {
			TowerBuilder builder = new TowerBuilder();
			if (theGame.getPlayer(0).getMoney() < builder.buildTower(id, null,
					null).getBuy())
				return false;
			else
				return true;

		}

	}

	public void switchButtons(String button) {
		if (button == "Start Game!") {
			startStopPanel.remove(startButton);
			startStopPanel.remove(time);
			startStopPanel.add(pauseButton);
			startStopPanel.add(time);
		} else {
			startStopPanel.remove(pauseButton);
			startStopPanel.remove(time);
			startStopPanel.add(startButton);
			startStopPanel.add(time);
			startStopPanel.repaint();
		}

	}
}
