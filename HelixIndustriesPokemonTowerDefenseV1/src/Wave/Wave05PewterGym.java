package Wave;

import java.awt.image.BufferedImage;

import Mob.Diglett;
import Mob.Geodude;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Onix;
import Mob.Sandshrew;

public class Wave05PewterGym extends Wave{
	private int delay = 500;
	private int level = 5;

	public Wave05PewterGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 50; i++){
			if(i < 25){
				if(i % 2 == 0)
					add(m.buildMob(MobID.DIGLETT));
				else
					add(m.buildMob(MobID.SANDSHREW));
			}
			else if(i >= 25 && i < 49){
				if(i % 2 == 0)
					add(m.buildMob(MobID.DIGLETT));
				else
					add(m.buildMob(MobID.GEODUDE));
			}
			else
				add(m.buildMob(MobID.ONIX));
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
