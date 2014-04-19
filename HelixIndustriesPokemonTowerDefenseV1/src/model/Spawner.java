package model;

import java.util.ArrayList;

public class Spawner {

	private Wave wave;
	private ArrayList<Mob> mobs = new ArrayList<Mob>();
	
	public Spawner (Wave wave) {
		this.wave = wave;
	}
	
}
