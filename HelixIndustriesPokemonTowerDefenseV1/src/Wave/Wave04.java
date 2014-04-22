package Wave;

import Mob.Jigglypuff;
import Mob.Mankey;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;

public class Wave04 extends Wave{
	private int delay = 1000;
	
	public Wave04(){
		super();
		for(int i = 0; i < 35; i++){
			if(i < 5){
				if(i % 2 == 0)
					add(new Rattata());
				else
					add(new Pidgey());
			}
			else if (i > 5 && i < 30){
				if(i % 2 == 0)
					add(new Pidgey());
				else
					add(new Spearow());
			}
			else if(i > 30 && i < 35){
				if(i % 2 == 0)
					add(new Mankey());
				else
					add(new Sandshrew());
			}
			else
				add(new Jigglypuff());
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}
}

