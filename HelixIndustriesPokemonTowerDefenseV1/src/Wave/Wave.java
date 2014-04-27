package Wave;

import java.util.ArrayList;

import javax.swing.Timer;

import Mob.Mob;


public abstract class Wave
{
	private ArrayList<Mob> wave = new ArrayList<Mob>();
	private Mob baddie;
	private int delay = 1;
	Timer t;// = new Timer(delay, WaveStart).start();
	
	//Wave sends itself to attack
	public void sendWave()
	{
	
	}
	
	public void add(Mob baddie){
		wave.add(baddie);
	}

	public Mob getBaddie() {
		return baddie;
	}

	public void setBaddie(Mob baddie) {
		this.baddie = baddie;
	}
	
	public ArrayList<Mob> getWave(){
		return wave;
	}
	
	public void setWave(ArrayList<Mob> wave){
		this.wave = wave;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}


}
