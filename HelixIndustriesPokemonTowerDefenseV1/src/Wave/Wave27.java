package Wave;

import java.awt.image.BufferedImage;

import Mob.Dodrio;
import Mob.Doduo;
import Mob.Fearow;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Raticate;
import Mob.Spearow;

public class Wave27 extends Wave{

	private int delay = 500;
	private int level = 27;
	
	public Wave27(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 900; i++){
			if(i % 5 == 0)
				add(m.buildMob(MobID.DODRIO));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.FEAROW));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.RATICATE));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.DODUO));
			else
				add(m.buildMob(MobID.SPEAROW));
		}
	}
}
