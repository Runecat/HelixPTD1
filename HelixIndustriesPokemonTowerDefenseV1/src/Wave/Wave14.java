package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Oddish;
import Mob.Bellsprout;
import Mob.Pidgey;
import Mob.Venonat;
import Mob.Gloom;
import Mob.Pidgeotto;
import Mob.Weepinbell;
import Mob.Goldeen;
import Mob.Horsea;
import Mob.Poliwag;


public class Wave14 extends Wave{

	private int delay = 750;
	private int level = 14;
	
	public Wave14(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 250; i++){
			if(i < 50){
				if(i % 3 == 0)
					add(m.buildMob(MobID.ODDISH));
				else if (i % 2 == 0)
					add(m.buildMob(MobID.BELLSPROUT));
				else
					add(m.buildMob(MobID.PIDGEY));
			}
			else if(i >= 50 && i < 150 || i >= 225){
				if(i % 4 == 0)
					add(m.buildMob(MobID.VENONAT));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.GLOOM));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.WEEPINBELL));
				else
					add(m.buildMob(MobID.PIDGEOTTO));
			}
			else{
				if(i % 3 == 0)
					add(m.buildMob(MobID.GOLDEEN));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.HORSEA));
				else
					add(m.buildMob(MobID.POLIWAG));
			}
		}
	}

}
