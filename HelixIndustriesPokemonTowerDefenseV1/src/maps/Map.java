package maps;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Game;
import model.Spawner;
import model.Tile;

import Mob.Mob;

import towers.*;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 *
 */

public abstract class Map implements Serializable {
	protected int width;
	protected int height;
	protected int tileLength;
	private int levels;
	private int currentLevel = 0;

	private int offset;
	Tile[][] grid;
	private List<Tile> path = new ArrayList<Tile>();
	private ArrayList<Spawner> spawners = new ArrayList<Spawner>();
	private ArrayList<Mob> mobList = new ArrayList<Mob>();
	private Spawner spawner;

	private Game theGame;

	public void setGame(Game theGame) {
		this.theGame = theGame;
	}

	public void buildPath() {
		Tile curr = spawner.getTile();
		buildPathHelper(curr);
	}

	public void buildPathHelper(Tile curr) {
		if (curr.getNextTile().size() != 0) {
			if (!path.contains(curr))
				path.add(curr);
			else
				return;
			for (int i = 0; i < curr.getNextTile().size(); i++) {
				buildPathHelper(curr.getNextTile().get(i));
			}
		}
		if (path.size() != 0 && curr.getNextTile().size() == 0) {
			path.add(curr);
		}
		
	}
	
	public int getOffset() {
		return offset;
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}

	public ArrayList<Mob> getMobList() {
		return mobList;
	}

	public void addMob(Mob m) {
		mobList.add(m);
	}

	public Spawner getSpawner() {
		return spawner;
	}

	public List<Tile> getPath() {
		return path;
	}

	public void buildGrid(int width, int height) {
		grid = new Tile[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Tile(i, j, this);
				grid[i][j].setPlayer(theGame.getPlayer(0));
			}
		}
	}

	// Gets the grid
	public Tile[][] getGrid() {
		return grid;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public void setSpawner(Spawner spawn) {
		this.spawner = spawn;
	}

	public void createTower(int x, int y, Tower t) {
		grid[x][y].setObject(t);
	}

	public int getCurrentLevel() {
		return currentLevel;
	}
	
	public boolean getWon() {
		if (currentLevel > levels)
			return true;
		else
			return false;
	}

	public void nextLevel() {
		if (currentLevel <= levels)
			currentLevel += 1;
	}

	public void buildCurrentWave() {
		spawner.buildCurrentWave(currentLevel);
	}

	public void sendWave() {
		spawner.sendWave();
		// this way because current starts at 0, it will match the spawner's
		// indexing.
	}

	public void moveMobs() {

		for (int i = path.size() - 1; i >= 0; i--) {
			path.get(i).moveMobs();
		}
	}

	// Gets a tile
	public Tile getTile(int row, int col) {
		return grid[row][col];
	}

	// Returns tower on a tile in the grid
	public Object getObject(int row, int col) {
		return grid[row][col].getObject();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void addSpawner(int row, int col) {
		grid[row][col].setSpawner(spawner);
		spawners.add(grid[row][col].getSpawnerTile());
	}

	public ArrayList<Spawner> getSpawners() {
		return spawners;
	}

	public abstract Image getBackground();

}
