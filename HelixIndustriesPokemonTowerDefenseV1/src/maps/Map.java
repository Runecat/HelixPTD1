package maps;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Directions;
import model.Game;
import model.Spawner;
import model.Tile;

import Mob.Mob;

import towers.*;

public abstract class Map {
	protected int width;
	protected int height;
	protected int tileLength;
	private int levels;
	private int currentLevel = 0;

	Tile[][] grid;
	private List<Tile> path = new ArrayList<Tile>();
	private ArrayList<Spawner> spawners = new ArrayList<Spawner>();
	private Spawner spawner;

	private Game theGame;

	public void setGame(Game theGame) {
		this.theGame = theGame;
	}

	public void buildPath() {
		Tile curr = spawner.getTile();
		while (curr != null) {
			path.add(curr);
			curr = curr.next();
		}
	}

	public List<Tile> getPath() {
		return path;
	}

	public void buildGrid(int width, int height) {
		grid = new Tile[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Tile(i, j);
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

	public void sendWave() {
		spawner.sendWave(currentLevel);
		// this way because current starts at 0, it will match the spawner's
		// indexing.
		if (currentLevel < levels)
			currentLevel += 1;
	}

	public void moveMobs() {
		Tile current = spawner.getTile();

		while (current != null) {
			current.moveMobs();
			current = current.next();
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
