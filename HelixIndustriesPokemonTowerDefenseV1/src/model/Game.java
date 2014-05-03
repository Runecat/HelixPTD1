package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import maps.Map;
import attacks.Attack;
import towers.Tower;
import Mob.Mob;
import ObserverModel.Observable;

public class Game extends Observable {
	
	private final static int MAX_PLAYERS = 2;	// The most we can have is 2 for multiplayer. But will usually be 1.
	private final static int spriteWidth = 10;
	private final static int spriteHeight = 10;
	private final static int spriteRows = 5;
	private final static int spriteColumns = 5;
	private List<Map> mapList;
	
	
	private Map currentMap;		// dont know if we want this for sure. 
	// Do we want the game class handling everything (main screen, map choice, menus) or just the actual
	// game at hand?
	
	private List<Player> players = new ArrayList<Player>(MAX_PLAYERS); // A list of players. yup.
	//private ArrayList<Mob> mobs;
	//private ArrayList<Tower> towers;
	
	public Game() {	// added constructor.
		// add observers and other things.
		mapList = new ArrayList<Map>();
	}
	
	public void addMap(Map input) {
		mapList.add(input);
	}
	
	public static void main(String args[]) 
	{
		/*
		BufferedImage pokemonSpriteSheet = ImageIO.read(new File("Images/CondensedPokemonSprites.png"));
		BufferedImage[] sprites = new BufferedImage[spriteRows*spriteColumns];
		
		for(int i = 0; i<spriteColumns;i++)
		{
			for(int j = 0; i<spriteRows;j++)
			{
				sprites[(i*spriteColumns)+j] = pokemonSpriteSheet.getSubimage(
					i*spriteWidth,
					j*spriteHeight,
					spriteWidth,
					spriteHeight);
			}
	
		ArrayList<Tower> towers = null;
		ArrayList<Mob> mobs = null;
		for(Tower t:towers)
		{
			//attack for every mob in range once timer goes off(probably call function)
		}
		
		for(Mob m:mobs)
		{
			//move to next tile every time the timer goes off(probably call function)
		}
		}
		//Set up listeners for placing towers, 
		//Set up Timer and listeners for tower attacks.
		 * 
		 */
	}
	
	public Map getCurrentMap() {	// added this
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
	
	
	


}
