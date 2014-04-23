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
	
	
	private Map currentMap = null;		// dont know if we want this for sure. 
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
	
	public static void main(String args[]) throws IOException
	{
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
	
	public ArrayList<Mob> calculateRange(Tower t, Attack a)
	{
		ArrayList<Mob> mobs = null;
		ArrayList<Tile> tilesInRange = null;
		Tile[][] grid = currentMap.getGrid();
		//grab which tiles are in range
		//for those tiles in range, find mobs on them
		//have tower attack those mobs if permitted to
		int xMin = t.getColumn() - a.getHorizontalRange();
		int xMax = t.getColumn() + a.getHorizontalRange();
		int yMin = t.getRow() - a.getVerticalRange();
		int yMax = t.getRow() - a.getVerticalRange();
		
		int x;
		int y;
		
		if(xMin <0)
		{
			xMin = 0;
		}
		
		if(yMin < 0)
		{
			yMin = 0;
		}
		
		if(xMax > currentMap.getWidth())
		{
			xMax = currentMap.getWidth();
		}
		
		if(yMax > currentMap.getHeight())
		{
			yMax = currentMap.getHeight();
		}
		//possibly need to add -1 to the max....
		
		
		for(x = xMin;x<xMax;x++)
		{
			for(y = yMin;y<yMax;y++)
			{
				if(grid[x][y].hasMob())
				{
					tilesInRange.add(grid[x][y]);
				}
			}
		}
		
		mobs.add(tilesInRange.get(0).getMobs().get(0));//for now, just attack first mob in first tile
		
		//depending on type, add from all possible mobs the only mobs that will attack
		return mobs;
	}
	


}
