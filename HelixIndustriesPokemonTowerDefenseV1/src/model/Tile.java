package model;

public class Tile {
	
	int height;
	int width;
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasEnemy;
	private boolean canPlaceTower;
	private boolean isWater;
	private boolean isLand;
	Object myObject = null;
	
	public Tile(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setObject(Object obj) {
		this.myObject = obj;
	}
	
	public Object getObject() {
		return this.myObject;
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
