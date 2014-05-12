package Wave;

import java.awt.image.BufferedImage;

import Mob.Doduo;
import Mob.Fearow;
import Mob.Lickitung;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Parasect;
import Mob.Raticate;
import Mob.Shellder;
import Mob.Spearow;
import Mob.Tentacool;

public class Wave29 extends Wave{

	private int delay = 500;
	private int level = 29;
	
	public Wave29(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 1050; i++){
			if(i % 13 == 0)
				add(m.buildMob(MobID.PARASECT));
			else if(i % 11 == 0)
				add(m.buildMob(MobID.LICKITUNG));
			else if(i % 6 == 0)
				add(m.buildMob(MobID.TENTACOOL));
			else if(i % 5 == 0)
				add(m.buildMob(MobID.SHELLDER));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.FEAROW));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.DODUO));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.RATICATE));
			else
				add(m.buildMob(MobID.SPEAROW));
		}
	}
	
}
