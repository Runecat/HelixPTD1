package Wave;

import java.awt.image.BufferedImage;

import Mob.Articuno;
import Mob.Golduck;
import Mob.Kingler;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Seel;
import Mob.Zubat;

public class Wave33 extends Wave{

	private int delay = 500;
	private int level = 33;

	public Wave33(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 1999; i++){
			if(i < 400)
				add(m.buildMob(MobID.ZUBAT));
			else if(i >= 400 && i < 800){
				if(i % 3 == 0)
					add(m.buildMob(MobID.KINGLER));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.SEEL));
				else
					add(m.buildMob(MobID.GOLDUCK));
			}
			else if(i >= 800 && i < 1400)
				add(m.buildMob(MobID.ZUBAT));
			else{
				if(i % 4 == 0)
					add(m.buildMob(MobID.KINGLER));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.ZUBAT));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.SEEL));
				else
					add(m.buildMob(MobID.GOLDUCK));
			}
		}
		add(m.buildMob(MobID.ARTICUNO));
	}
}
