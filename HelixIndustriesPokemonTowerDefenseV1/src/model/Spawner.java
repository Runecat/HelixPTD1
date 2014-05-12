package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import Mob.Mob;
import Wave.Wave;

public class Spawner {

	private Tile tile;
	private ArrayList<Mob> mobs = new ArrayList<Mob>();
	private ArrayList<Wave> waves = new ArrayList<Wave>();
	private int level;

	// removed timer

	public Spawner(Tile tile, ArrayList<Wave> waves) {
		this.tile = tile;
		this.waves = waves;
		tile.setSpawner(this);
	}

	// Sends the wave of the level given, goes to sendMob listener
	public void sendWave(int level) {
		

		if (level < waves.size())
			setMobs(level);
		if (mobs.size() != 0) {
			sendMob();
		}

		this.level++;
	}
	
	public void sendMob() {
		tile.addMobs(mobs.get(0));
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
			mobs.get(i).setCurrentTile(this.getTile());
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

	// private int getLevel(Wave wave) {
	// return level;
	// }
	// Not currently necessary

}
