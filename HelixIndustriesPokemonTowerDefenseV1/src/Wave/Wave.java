package Wave;

import java.util.ArrayList;

import javax.swing.Timer;

import Mob.Mob;


public class Wave
{
	private ArrayList<Mob> mobs;
	private Mob baddie;
	public int level = 1;//Level of wave
	private int delay = 1;
	Timer t;// = new Timer(delay, WaveStart).start();
	
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


}
