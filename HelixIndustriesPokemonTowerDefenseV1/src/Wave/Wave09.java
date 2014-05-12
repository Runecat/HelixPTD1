package Wave;

import java.awt.image.BufferedImage;

import Mob.Ekans;
import Mob.Goldeen;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Poliwag;
import Mob.Psyduck;
import Mob.Spearow;

public class Wave09 extends Wave{

	private int delay = 1000;
	private int level = 9;
	
	public Wave09(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 110; i++){
			if(i < 35){
				if(i % 2 == 0)
					add(m.buildMob(MobID.EKANS));
				else
					add(m.buildMob(MobID.SPEAROW));
			}
			else{
				if(i % 2 == 0)
					add(m.buildMob(MobID.POLIWAG));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.PSYDUCK));
				else
					add(m.buildMob(MobID.GOLDEEN));
			}
		}
	}
}
