package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Rattata;

public class Wave39 extends Wave{

	private int delay = 100;
	private int level = 39;

	public Wave39(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 2200; i++){
			if(i % 2 == 0)
				add(m.buildMob(MobID.RATTATA));
			else
				add(m.buildMob(MobID.PIDGEY));
		}
	}
}