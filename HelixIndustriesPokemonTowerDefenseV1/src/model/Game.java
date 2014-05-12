package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

import towers.Tower;
import towers.TowerBuilder;
import towers.TowerID;

import maps.Map;

import ObserverModel.PanelObservable;

public class Game extends PanelObservable {

	private final static int MAX_PLAYERS = 2; // The most we can have is 2 for
												// multiplayer. But will usually
												// be 1.

	// move this somewhere else
	private final static int spriteWidth = 10;
	private final static int spriteHeight = 10;
	private final static int spriteRows = 5;
	private final static int spriteColumns = 5;

	public static Timer gameTimer;
	private int timeElapsed = 0;
	private int spawnerOffset = -1;
	private int moveOffset;
	
	private TowerBuilder towerBuilder;
	private List<Tower> towerList = new ArrayList<Tower>();
	
	private TowerID currentTowerSelected;
	private boolean isPlacingTower;
	
	private List<Map> mapList;
	
	private Tower currentTowerInfo;
	
	private boolean midRound;
	

	private Map currentMap; // dont know if we want this for sure.
	// Do we want the game class handling everything (main screen, map choice,
	// menus) or just the actual
	// game at hand?

	private List<Player> players = new ArrayList<Player>(MAX_PLAYERS); // A list
																		// of
																		// players.
																		// yup.

	// private ArrayList<Mob> mobs;
	// private ArrayList<Tower> towers;

	public Game() { // added constructor.
		// add observers and other things.
		Player thisPlayer = new Player("Chars");
		thisPlayer.addMoney(3000);
		this.addPlayer(thisPlayer);
		
		mapList = new ArrayList<Map>();
		gameTimer = new Timer(10, new GameTimerListener());
		towerBuilder = new TowerBuilder();
		midRound = true;
		
		
	}
	
	public void setCurrentTowerInfo(Tower t) {
		currentTowerInfo = t;
	}
	
	public Tower getCurrentTowerInfo() {
		return currentTowerInfo;
	}
	
	public int getTime() {
		return timeElapsed/100;
	}
	
	
	public void setCurrentMap(int i) {		// this will be changed to an ID enum system
		currentMap = mapList.get(i);
		currentMap.setGame(this);
		
	}

	public void startTimer() {
		gameTimer.start();
	}
	
	public void stopTimer() {
		gameTimer.stop();
	}

	public void addMap(Map input) {
		mapList.add(input);
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
	
	public void setMidRound(boolean b) {
		midRound = b;
	}
	
	public boolean canPlaceTower(int x, int y) {
		if (isPaused() && midRound)
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
		Tower t = towerBuilder.buildTower(i, currentMap.getTile(x, y), currentMap);
		towerList.add(t);
		players.get(0).addMoney(-1 * t.getBuy());
		currentMap.createTower(x, y, t);
		notifyObservers();
	}

	private class GameTimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			timeElapsed++;
			// moving mobs is synced with timer
			moveOffset++;
			if (moveOffset > 120) {
				currentMap.moveMobs();
				moveOffset = 0;
			}

			// spawning is synced~~~~~~~~~~
			spawnerOffset++;
			if (spawnerOffset > 200 || spawnerOffset == 0) {
				currentMap.sendWave();
				spawnerOffset = 0;
			}
			// spawning ~~~~~~~~~~~~~~~~~~~

			// sync towers in here
			for (int i = 0; i < towerList.size(); i++) {
				towerList.get(i).attack();
			}
			
			// mob deaths
			//for (int i = 0; i < currentMap.getPath().size(); i++) {
			//	players.get(0).addMoney(currentMap.getPath().get(i).checkDeaths());
			//}
			notifyObservers();

		}

	}

}
