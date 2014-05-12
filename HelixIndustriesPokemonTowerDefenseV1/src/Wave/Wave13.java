package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Voltorb;
import Mob.Magnemite;
import Mob.Machop;

public class Wave13 extends Wave{
	
	private int delay = 250;
	private int level = 13;
	
	public Wave13(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 250; i++){
			if(i % 5 == 0)
				add(m.buildMob(MobID.MACHOP));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.VOLTORB));
			else
				add(m.buildMob(MobID.MAGNEMITE));
		}
	}

}
