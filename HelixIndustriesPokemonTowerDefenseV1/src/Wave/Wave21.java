package Wave;

import java.awt.image.BufferedImage;

import Mob.Doduo;
import Mob.Fearow;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Rattata;
import Mob.Spearow;

public class Wave21 extends Wave{

	private int delay = 500;
	private int level = 21;
	public Wave21(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 500; i++){
			if(i % 4 == 0)
				add(m.buildMob(MobID.FEAROW));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.SPEAROW));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.DODUO));
			else
				add(m.buildMob(MobID.RATTATA));
		}
	}
}
