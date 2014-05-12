package Wave;

import java.awt.image.BufferedImage;

import Mob.Cloyster;
import Mob.Dewgong;
import Mob.Jynx;
import Mob.Lapras;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Slowbro;

public class Wave46EliteLorelei extends Wave{

	private int delay = 444;
	private int level = 46;
	
	public Wave46EliteLorelei(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 4000; i++){
			if(i % 5 == 0)
				add(m.buildMob(MobID.JYNX));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.LAPRAS));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.CLOYSTER));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.DEWGONG));
			else
				add(m.buildMob(MobID.SLOWBRO));
		}
	}
}
