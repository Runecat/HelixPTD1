package Wave;


import java.awt.image.BufferedImage;

import Mob.Caterpie;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Weedle;

public class Wave03 extends Wave{
	private int delay = 1000;
	private int level = 3;

	public Wave03(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 25; i++){
			if(i < 15)
				if(i % 2 == 0)
					add(m.buildMob(MobID.RATTATA));
				else
					add(m.buildMob(MobID.PIDGEY));
			else
				if(i % 2 == 0)
					add(m.buildMob(MobID.WEEDLE));
				else
					add(m.buildMob(MobID.CATERPIE));
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