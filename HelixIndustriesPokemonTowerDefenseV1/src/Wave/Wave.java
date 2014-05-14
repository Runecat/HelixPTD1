package Wave;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Timer;

import Mob.Mob;
import Mob.MobBuilder;
import Mob.MobID;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public abstract class Wave implements Serializable
{
	private ArrayList<Mob> wave = new ArrayList<Mob>();
	private Mob baddie;
	private int delay = 1;
	Timer t;
	protected MobBuilder mobBuilder;
	
	public Wave()
	{
		mobBuilder = new MobBuilder();
	}
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
