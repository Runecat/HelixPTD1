package Wave;

import java.awt.image.BufferedImage;

import Mob.Jigglypuff;
import Mob.Mankey;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;

public class Wave07 extends Wave{
	private int delay = 1000;
	private int level = 7;
	
	public Wave07(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 75; i++){
			if(i < 5){
				if(i % 2 == 0)
					add(m.buildMob(MobID.RATTATA));
				else
					add(m.buildMob(MobID.PIDGEY));
			}
			else if (i > 5 && i < 45){
				if(i % 2 == 0)
					add(m.buildMob(MobID.PIDGEY));
				else
					add(m.buildMob(MobID.SPEAROW));
			}
			else if(i > 45 && i < 72){
				if(i % 2 == 0)
					add(m.buildMob(MobID.MANKEY));
				else
					add(m.buildMob(MobID.SANDSHREW));
			}
			else
				add(m.buildMob(MobID.JIGGLYPUFF));
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
