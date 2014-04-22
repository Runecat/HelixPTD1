package maps;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

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
		
		grid[5][5].setHasTower(true);
		grid[3][6].setHasMob(true);
				
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
