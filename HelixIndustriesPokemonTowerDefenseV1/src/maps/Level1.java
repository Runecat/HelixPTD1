package maps;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Mob.Bellsprout;
import Wave.Wave;
import Wave.Wave01;
import Wave.Wave02;

import towers.Charmander;
import view.ImageLoader;

import model.Spawner;
import model.Tile;

public class Level1 extends Map {
	
	ImageLoader loader;
	
	
	private BufferedImage background;
	private Tile[][] grid;
	
	private final int width = 16;
	private final int height = 16;
	private final int tileDimension = 8;
	
	private LinkedList<Tile> path;
	private ArrayList<Spawner> spawners;
	
	public Level1() {
		super();
		loader = new ImageLoader();
		
		try {
			this.background = loader.loadImage("Images/Route5.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		grid = new Tile[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = new Tile(tileDimension, tileDimension);
			}
		}
		ArrayList<Wave> waves = new ArrayList<Wave>();
		waves.add(new Wave01());
		waves.add(new Wave02());
		
		grid[3][0].setSpawnerTile(new Spawner(grid[3][0], waves));
		
		// TRACK NIGGA
		grid[3][0].setNextTile(grid[3][1]);
		grid[3][1].setNextTile(grid[3][2]);
		grid[3][2].setNextTile(grid[3][3]);
		grid[3][3].setNextTile(grid[3][4]);
		grid[3][4].setNextTile(grid[3][5]);
		grid[3][5].setNextTile(grid[3][6]);
		grid[3][6].setNextTile(grid[3][7]);
		grid[3][7].setNextTile(grid[3][8]);

		grid[3][0].getSpawnerTile().sendWave(1);
		// YEEEAH
		
		grid[5][5].setObject(new Charmander(null, grid[5][5], null));
		//grid[3][6].addMobs(new Bellsprout(null));
				
	}
	
	public int getGridWidth() {
		return grid.length;
	}
	
	public int getGridHeight() {
		return grid[0].length;
	}
	
	public Tile[][] getGrid() {
		return grid;
	}
	
	
	

	public Image getBackground() {
		return this.background;
	}
	
	
	

	
	
	

	

	
	
}
