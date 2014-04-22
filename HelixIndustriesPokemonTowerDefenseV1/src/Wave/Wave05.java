package Wave;

import Mob.Diglett;
import Mob.Geodude;
import Mob.Mob;
import Mob.Onix;
import Mob.Sandshrew;

public class Wave05 extends Wave{
	private int delay = 500;

	public Wave05(){
		super();
		for(int i = 0; i < 50; i++){
			if(i < 25){
				if(i % 2 == 0)
					add(new Diglett());
				else
					add(new Sandshrew());
			}
			else if(i > 25 && i < 49){
				if(i % 2 == 0)
					add(new Diglett());
				else
					add(new Geodude());
			}
			else
				add(new Onix());
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}
}
