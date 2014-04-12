package model;

import towers.*;

public class Map 
{
	int width = 800;
	int height = 720;
	Tile [][] grid = new Tile[height][width];
	
	public Map(int width, int height, Tile [][] grid) {
		this.width = width;
		this.height = height;
		this.grid = grid;
		buildGrid();
	}
	
	public void buildGrid() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				grid[i][j] = new Tile(height, width);
			}
		}
	}
	
	// Puts tower on a tile in the grid
	public void setTower(int row, int col, Tower tower) {
		grid[row][col].setObject(tower);
	}
	
	// Returns tower on a tile in the grid
	public Object getObject(int row, int col) {
		return grid[row][col].myObject;
	}
	
	// Set methods for enemies, path, background, frame, more

}
