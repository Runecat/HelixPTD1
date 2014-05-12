package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgeotto;
import Mob.Pidgey;
import Mob.Raticate;
import Mob.Rattata;
import Mob.Tangela;

public class Wave37 extends Wave{

	private int delay = 500;
	private int level = 37;

	public Wave37(){
	super();
	MobBuilder m = super.mobBuilder;
	for(int i = 0; i < 1600; i++){
		if(i % 5 == 0)
			add(m.buildMob(MobID.PIDGEY));
		else if(i % 4 == 0)
			add(m.buildMob(MobID.PIDGEOTTO));
		else if(i % 3 == 0)
			add(m.buildMob(MobID.RATTATA));
		else if(i % 2 == 0)
			add(m.buildMob(MobID.RATICATE));
		else 
			add(m.buildMob(MobID.TANGELA));
	}
	}
}
