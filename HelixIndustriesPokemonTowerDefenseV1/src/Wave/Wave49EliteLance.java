package Wave;

import java.awt.image.BufferedImage;

import Mob.Gyarados;
import Mob.Dragonite;
import Mob.Dragonair;
import Mob.Aerodactyl;
import Mob.MobBuilder;
import Mob.MobID;

public class Wave49EliteLance extends Wave{

	private int delay = 444;
	private int level = 49;

	public Wave49EliteLance(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(m.buildMob(MobID.DRAGONITE));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.GYARADOS));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.AERODACTYL));
			else
				add(m.buildMob(MobID.DRAGONAIR));
		}
	}
}
