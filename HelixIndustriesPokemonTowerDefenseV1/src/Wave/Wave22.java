package Wave;

import java.awt.image.BufferedImage;

import Mob.Bellsprout;
import Mob.Mankey;
import Mob.Meowth;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Oddish;
import Mob.Vulpix;

public class Wave22 extends Wave{

	private int delay = 500;
	private int level = 22;
	
	public Wave22(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 550; i++){
			if(i % 5 == 0)
				add(m.buildMob(MobID.ODDISH));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.BELLSPROUT));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.MEOWTH));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.MANKEY));
			else
				add(m.buildMob(MobID.VULPIX));
		}
	}
}
