package Wave;

import java.awt.image.BufferedImage;

import Mob.EliteArbok;
import Mob.Gengar;
import Mob.EliteHaunter;
import Mob.Golbat;
import Mob.MobBuilder;
import Mob.MobID;

public class Wave48EliteAgatha extends Wave{

	private int delay = 444;
	private int level = 48;
	

	public Wave48EliteAgatha(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(m.buildMob(MobID.ELITE_HAUNTER));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.ELITE_ARBOK));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.GOLBAT));
			else
				add(m.buildMob(MobID.GENGAR));
		}
	}
}
