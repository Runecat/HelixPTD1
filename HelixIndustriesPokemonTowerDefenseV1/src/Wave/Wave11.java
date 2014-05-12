package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Oddish;
import Mob.Bellsprout;
import Mob.Venonat;
import Mob.Pidgeotto;
import Mob.Weedle;
import Mob.Caterpie;
import Mob.Pidgey;

public class Wave11 extends Wave{

	private int delay = 1000;
	private int level = 11;
	
	public Wave11(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 150; i++){
			if(i < 25){
				if(i % 2 == 0)
					add(m.buildMob(MobID.CATERPIE));
				else
					add(m.buildMob(MobID.WEEDLE));
			}
			else if(i > 25 && i < 75){
				if(i % 2 == 0)
					add(m.buildMob(MobID.ODDISH));
				else
					add(m.buildMob(MobID.BELLSPROUT));
			}
			else if(i > 75 && i < 145){
				if(i % 2 == 0)
					add(m.buildMob(MobID.VENONAT));
				if(i % 3 == 0)
					add(m.buildMob(MobID.ODDISH));
				else
					add(m.buildMob(MobID.BELLSPROUT));
			}
			else
				add(m.buildMob(MobID.PIDGEOTTO));
		}
	}
}
