package model;

import java.util.ArrayList;
import java.util.List;

import ObserverModel.Observable;

public class Game extends Observable {
	
	private final int MAX_PLAYERS = 2;	// The most we can have is 2 for multiplayer. But will usually be 1.
	
	private Map currentMap = null;		// dont know if we want this for sure. 
	// Do we want the game class handling everything (main screen, map choice, menus) or just the actual
	// game at hand?
	
	private List<Player> players = new ArrayList<Player>(MAX_PLAYERS); // A list of players. yup.
	
	public Game() {	// added constructor.
		// add observers and other things.
	}
	
	public Map getMap() {	// added this
		return this.currentMap;
	}
	
	public void setMap(Map map) {	// added this
		this.currentMap = map;
	}
	
	public void addPlayer(Player player) {	// added thiss
		players.add(player);
	}
	
	public List<Player> getPlayers() {	// added this
		return players;
	}
	
	public ArrayList<Mob> calculateRange(Tower t, Attack a)
	{
		ArrayList<Mob> mobs;
		return mobs;
	}
	


}
