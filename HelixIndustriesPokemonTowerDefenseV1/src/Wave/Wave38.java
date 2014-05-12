package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Rattata;

public class Wave38 extends Wave{

	private int delay = 100;
	private int level = 38;

	
	public Wave38(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 2000; i++){
			if(i % 2 == 0)
				add(m.buildMob(MobID.RATTATA));
			else
				add(m.buildMob(MobID.PIDGEY));
		}
	}
}
