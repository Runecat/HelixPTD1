package Wave;

import java.awt.image.BufferedImage;

import Mob.Bellsprout;
import Mob.Exeggcute;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Oddish;
import Mob.Tangela;
import Mob.Victreebell;
import Mob.Weepinbell;
import Mob.Vileplume;

public class Wave20CeladonGym extends Wave{

	private int delay = 500;
	private int level = 20;
	
	public Wave20CeladonGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 550; i++){
			if(i < 400){
				if(i % 19 == 0)
					add(m.buildMob(MobID.EXEGGCUTE));
				else if(i % 11 == 0)
					add(m.buildMob(MobID.WEEPINBELL));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.ODDISH));
				else
					add(m.buildMob(MobID.BELLSPROUT));
			}
			else{
				if(i % 3 == 0)
					add(m.buildMob(MobID.VICTREEBELL));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.TANGELA));
				else
					add(m.buildMob(MobID.VILEPLUME));
			}
		}
	}

}
