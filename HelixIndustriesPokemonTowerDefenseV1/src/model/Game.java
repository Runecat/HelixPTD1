package model;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import towers.Tower;
import towers.TowerBuilder;
import towers.TowerID;
import view.MapPanel;

import maps.Map;

import Mob.Mob;
import ObserverModel.PanelObservable;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class Game extends PanelObservable implements Serializable {

	private final static int MAX_PLAYERS = 2; // The most we can have is 2 for
												// multiplayer. But will usually
												// be 1.
	
	private transient PersistenceHandler persistence;


	public static Timer gameTimer;
	private int timeElapsed = 0;
	private int spawnerOffset = -1;
	private int moveOffset;
	
	private boolean hasLost = false;
	private boolean hasWon = false;

	private TowerBuilder towerBuilder;
	transient private List<Tower> towerList = new ArrayList<Tower>();

	private TowerID currentTowerSelected;
	private boolean isPlacingTower;

	transient private Tower currentTowerInfo;
	transient private ArrayList<Mob> currentMobsInfo;

	private boolean betweenRounds;

	transient private Map currentMap; 

	private List<Player> players = new ArrayList<Player>(MAX_PLAYERS); // A list
																		// of
																		// players.
																		// yup.

	

	public Game() { // added constructor.
		// add observers and other things.
		Player thisPlayer = new Player("Chars");
		thisPlayer.addMoney(500);
		this.addPlayer(thisPlayer);

		gameTimer = new Timer(10, new GameTimerListener());
		towerBuilder = new TowerBuilder();
		betweenRounds = true;
		

	}
	
	public void saveGame() {
		persistence = new PersistenceHandler(this);
		persistence.write();
	}
	
	public void speedUp() {
		gameTimer.setDelay(2);
	}
	
	public void slowDown() {
		gameTimer.setDelay(10);
	}

	public void setCurrentTowerInfo(Tower t) {
		currentTowerInfo = t;
	}

	public Tower getCurrentTowerInfo() {
		return currentTowerInfo;
	}

	public int getTime() {
		return timeElapsed / 100;
	}
	
	public boolean mobsAreDead() {
		for (int i = 0; i < currentMap.getPath().size(); i++) {
			if(!currentMap.getPath().get(i).isEmpty())
				return false;
		}
		return true;
	}

	

	public void startTimer() {
		gameTimer.start();
		notifyObservers();
	}

	public void stopTimer() {
		gameTimer.stop();
		notifyObservers();
	}


	public Map getCurrentMap() { // added this
		return this.currentMap;
	}

	public void setCurrentTowerSelected(TowerID i) {
		currentTowerSelected = i;
	}

	public TowerID getCurrentTowerSelected() {
		return currentTowerSelected;
	}

	public void setMap(Map map) { // added this
		this.currentMap = map;
	}

	public void addPlayer(Player player) { // added this
		players.add(player);
	}

	public List<Player> getPlayers() { // added this
		return players;
	}

	public Player getPlayer(int i) {
		return players.get(i);
	}

	public boolean isPaused() {
		return !gameTimer.isRunning();
	}

	public void setBetweenRounds(boolean b) {
		betweenRounds = b;
	}
	
	public boolean betweenRounds() {
		return betweenRounds;
	}

	public void startRound() {
		currentMap.buildCurrentWave();
		currentMap.nextLevel();
		betweenRounds = false;
	}
	
	public void endRound() {
		if (currentMap.getWon()) {
			win();
		}
		gameTimer.stop();
		betweenRounds = true;
		notifyObservers();
	}
	
	public void pause() {
		
	}
	
	public boolean hasLost() {
		return hasLost;
	}
	public void win() {
		gameTimer.stop();
		hasWon = true;
		notifyObservers();
	}
	
	public boolean hasWon() {
		return hasWon;
	}
	
	public void lose() {
		gameTimer.stop();
		hasLost = true;
	}

	public boolean canPlaceTower(int x, int y) {
		if (isPaused() && !betweenRounds)
			return false;
		if (currentMap.getTile(x, y).canPlaceTower() == false)
			return false;

		return true;
	}

	public void setIsPlacingTower(boolean b) {
		isPlacingTower = b;
	}

	public boolean getIsPlacingTower() {
		return isPlacingTower;
	}

	public void createTower(int x, int y, TowerID i) {
		Tower t = towerBuilder.buildTower(i, currentMap.getTile(x, y),
				currentMap);
		towerList.add(t);
		players.get(0).addMoney(-1 * t.getBuy());
		currentMap.createTower(x, y, t);
		notifyObservers();
	}

	public ArrayList<Mob> getCurrentMobsInfo() {
		return currentMobsInfo;
	}

	public void setCurrentMobsInfo(ArrayList<Mob> arrayList) {
		this.currentMobsInfo = arrayList;
	}

	private class GameTimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if (players.get(0).getHealth() <= 0) {
				lose();
			}

			timeElapsed++;
			// moving mobs is synced with timer
			moveOffset++;
			if (moveOffset > 75) {
				currentMap.moveMobs();
				moveOffset = 0;
			}

			// spawning is synced~~~~~~~~~~
			spawnerOffset++;
			if (spawnerOffset > 20 || spawnerOffset == 0) {
				if (currentMap.getSpawner().getMobs().size() != 0)
					currentMap.sendWave();
				else if (mobsAreDead() && currentMap.getSpawner().getMobs().size() == 0)
					endRound();

				spawnerOffset = 0;
			}
			// spawning ~~~~~~~~~~~~~~~~~~~

			// sync towers in here
			for (int i = 0; i < towerList.size(); i++) {
				towerList.get(i).attack();
			}

			// mob deaths
			notifyObservers();

		}

	}

}
