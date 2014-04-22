package model;

import java.util.ArrayList;

import Mob.Mob;
import Wave.Wave;

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
	
	public void addWave(Wave wave) {
		waves.add(wave);
	}
	
	public void sendWaves() {
		for (int i = 0; i < waves.size(); i++) {
			waves.get(i).sendWave();
		}
	}
	
	public void setMobs(int level) {
		
		mobs.add(waves.get(level).getBaddie());
	}
	
	public ArrayList<Mob> getMobs() {
		return mobs;
	}
	
	// Needs mob list of waves
	
}
