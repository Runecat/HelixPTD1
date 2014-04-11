package model;

public class Tile {
	
	int height = 0;
	int width = 0;
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasEnemy;
	private boolean canPlaceTower;
	private boolean isWater;
	private boolean isLand;
	
	public Tile(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public boolean isOnPath() {
		return isOnPath;
	}
	
	public boolean hasTower() {
		return hasTower;
	}
	
	public boolean isEmpty() {
		return isEmpty;
	}
	
	public boolean hasEnemy() {
		return hasEnemy;
	}
	
	public boolean canPlaceTower() {
		return canPlaceTower;
	}
	
	public boolean isWater() {
		return isWater;
	}
	
	public boolean isLand() {
		return isLand;
	}

}
