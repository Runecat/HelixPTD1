package Wave;

import java.util.ArrayList;

import Mob.Caterpie;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Weedle;

public class Wave03 extends Wave{
	private int delay = 1000;

	public Wave03(){
		super();
		for(int i = 0; i < 25; i++){
			if(i < 15)
				if(i % 2 == 0)
					add(new Rattata());
				else
					add(new Pidgey());
			else
				if(i % 2 == 0)
					add(new Weedle());
				else
					add(new Caterpie());
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}
}