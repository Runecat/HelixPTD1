package Wave;

import java.awt.image.BufferedImage;

import Mob.Mankey;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Nidorino;
import Mob.Rattata;
import Mob.Spearow;

public class Wave41 extends Wave{

	private int delay = 400;
	private int level = 41;

	public Wave41(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 3000; i++){
			if(i % 5 == 0)
				add(m.buildMob(MobID.RATTATA));					
			else if (i % 3 == 0)
				add(m.buildMob(MobID.NIDORINO));
			else if(i % 2== 0)
				add(m.buildMob(MobID.SPEAROW));
			else
				add(m.buildMob(MobID.MANKEY));
		}
	}
	
}
