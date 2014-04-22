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
	private SendMobListener sendMob;
	private int level;
	
	public Spawner (Tile tile, ArrayList<Wave> waves) {
		this.tile = tile;
		this.waves = waves;
		sendMob = new SendMobListener();
		
	}
	
	private class SendMobListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < mobs.size(); i++) {
				
			}
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
	
	public void sendWave(int level) {
		Timer t = new Timer(getDelay(level), sendMob);
	}
	
	public void setMobs(int level) {
		mobs.clear();
		for (int i = 0; i < waves.get(level).getWave().size(); i++)
			mobs.add(waves.get(level).getWave().get(i));
	}
	
	public ArrayList<Mob> getMobs() {
		return mobs;
	}
	
	private int getDelay(int level) {
		return waves.get(level).getDelay();
	}
		
}
