package Wave;

import java.util.ArrayList;

import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;

public class Wave01 extends Wave{
	private int delay = 1000;
	
	public Wave01(){
		super();
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0)
				add(new Rattata());
			else
				add(new Pidgey());
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}
}
