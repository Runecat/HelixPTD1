package Wave;

import java.awt.image.BufferedImage;

import Mob.Goldeen;
import Mob.Horsea;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Poliwag;
import Mob.Shellder;
import Mob.Staryu;
import Mob.Tentacool;
import Mob.Tentacruel;
import Mob.Zapdos;

public class Wave36 extends Wave{

	private int delay = 500;
	private int level = 36;
		
	public Wave36(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 1200; i++){
			if(i % 17 == 0)
				add(m.buildMob(MobID.TENTACRUEL));
			else if(i % 6 == 0)
				add(m.buildMob(MobID.HORSEA));
			else if(i % 5 == 0)
				add(m.buildMob(MobID.TENTACOOL));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.SHELLDER));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.GOLDEEN));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.POLIWAG));
			else 
				add(m.buildMob(MobID.STARYU));
		}
		add(m.buildMob(MobID.ZAPDOS));
	}
}
