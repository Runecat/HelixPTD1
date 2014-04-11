package model;

import java.util.ArrayList;

public class Wave
{
	private ArrayList<Mob> mobs;
	private Mob baddie;
	private int level = 0;//Level of wave
	
	//Wave sends itself to attack
	public void sendWave()
	{
	
	}
	
	public void addMobs(){
		mobs.add(baddie);
	}

	public Mob getBaddie() {
		return baddie;
	}

	public void setBaddie(Mob baddie) {
		this.baddie = baddie;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
