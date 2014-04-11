package model;

import towers.Tower;

public class Map 
{
	int width = 800;
	int height = 720;
	Tile tile = new Tile(width, height);
	Tile [][] grid = new Tile[height][width];
	Tower tower = new Tower();
	
	public Map(int width, int height, Tile [][] grid) {
		this.width = width;
		this.height = height;
		this.grid = grid;
	}
	
	// Puts tower on a tile in the grid
	// Still needs implementation
	public void setTower(Tile grid[][]) {
		
	}
	
	// Returns tower on a tile in the grid
	// WIP
	public Tower getTower(Tile tile) {
		if (tile.hasTower())
			return tower;
		else
			return null;
	}

}
