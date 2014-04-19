package model;

import java.util.ArrayList;

public class Spawner {

	private Tile tile;
	private ArrayList<Mob> mobs = new ArrayList<Mob>();
	private ArrayList<Wave> waves = new ArrayList<Wave>();
	
	public Spawner (Tile tile, ArrayList<Wave> waves) {
		this.tile = tile;
		this.waves = waves;
	}
	
	public Tile getTile() {
		return tile;
	}
	
	public ArrayList<Wave> getWaves() {
		return waves;
	}
	
	// Need to add methods and stuff
	
}
