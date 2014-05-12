package Wave;

import java.awt.image.BufferedImage;

import Mob.Drowzee;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;

public class Wave16 extends Wave{

	private int delay = 500;
	private int level = 16;

	public Wave16(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 250; i++){ 
			if(i % 5 == 0)
				add(m.buildMob(MobID.SPEAROW));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.DROWZEE));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.PIDGEY));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.SANDSHREW));
			else
				add(m.buildMob(MobID.RATTATA));
		}
	}
}
