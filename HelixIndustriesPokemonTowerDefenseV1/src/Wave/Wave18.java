package Wave;

import java.awt.image.BufferedImage;

import Mob.Ekans;
import Mob.Jigglypuff;
import Mob.Kadabra;
import Mob.Mankey;
import Mob.Meowth;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgey;
import Mob.Vulpix;

public class Wave18 extends Wave{

	private int delay = 500;
	private int level = 18;
	
	public Wave18(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 330; i++){
			if(i % 17 == 0)
				add(m.buildMob(MobID.JIGGLYPUFF));
			else if(i % 27 == 0)
				add(m.buildMob(MobID.KADABRA));
			else if(i % 5 == 0)
				add(m.buildMob(MobID.PIDGEY));
			else if (i % 4 == 0)
				add(m.buildMob(MobID.MANKEY));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.MEOWTH));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.EKANS));
			else
				add(m.buildMob(MobID.VULPIX));
		}
	}
}
