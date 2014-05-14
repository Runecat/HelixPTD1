package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Timer;

import maps.Map;

import Mob.Mob;
import Wave.Wave;
/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class Spawner implements Serializable{

	private Tile tile;
	private ArrayList<Mob> mobs = new ArrayList<Mob>();
	private ArrayList<Wave> waves = new ArrayList<Wave>();
	private Map currentMap;
	
	private boolean inWave;

	// removed timer

	public Spawner(Tile tile, ArrayList<Wave> waves, Map currentMap) {
		this.tile = tile;
		this.waves = waves;
		this.currentMap = currentMap;
		tile.setSpawner(this);
	}
	
	public void buildCurrentWave(int level) {
		if (level < waves.size())
			setMobs(level);
	}

	// Sends the wave of the level given, goes to sendMob listener
	public void sendWave() {
		inWave = true;

		if (mobs.size() != 0) {
			sendMob();
		}
		

	}
	
	public void sendMob() {
		tile.addMobs(mobs.get(0));
		currentMap.addMob(mobs.get(0));
		mobs.remove(0);
	}

	// Called from sendWave
	// sets the mob list to the mobs of the current level
	// adds mobs to the spawner tile on the path --> goes to Tile's addMobs()
	// removes mobs from the mob list

	// Sets the mob list to the mobs from the current level
	public void setMobs(int level) {
		// mobs.clear(); // mobs SHOULD be cleared already when sent. If not,
		// problem.
		for (int i = 0; i < waves.get(level).getWave().size(); i++) {
			mobs.add(waves.get(level).getWave().get(i));
			//mobs.get(i).setCurrentTile(this.getTile());
		}
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

	public ArrayList<Mob> getMobs() {
		return mobs;
	}

	private int getDelay(int level) {
		return waves.get(level).getDelay();
	}
}
