package Wave;

import java.awt.image.BufferedImage;

import Mob.Hitmonchan;
import Mob.Dewgong;
import Mob.EliteOnix;
import Mob.Hitmonlee;
import Mob.Machamp;
import Mob.MobBuilder;
import Mob.MobID;

public class Wave47EliteBruno extends Wave{

	private int delay = 444;
	private int level = 47;
	
	public Wave47EliteBruno(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(m.buildMob(MobID.HITMONLEE));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.HITMONCHAN));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.MACHAMP));
			else
				add(m.buildMob(MobID.ELITE_ONIX));
		}
	}
}
