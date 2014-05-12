package Wave;

import java.awt.image.BufferedImage;

import Mob.Meowth;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Oddish;
import Mob.Bellsprout;
import Mob.Venonat;
import Mob.Pidgeotto;
import Mob.Weedle;
import Mob.Caterpie;


public class Wave12 extends Wave{

	private int delay = 1000;
	private int level = 12;

	public Wave12(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 180; i++){
			if(i % 49 == 0)
				add(m.buildMob(MobID.MEOWTH));
			if(i < 35){
				if(i % 2 == 0)
					add(m.buildMob(MobID.CATERPIE));
				else
					add(m.buildMob(MobID.WEEDLE));
			}
			else if(i > 35 && i < 95){
				if(i % 2 == 0)
					add(m.buildMob(MobID.ODDISH));
				else
					add(m.buildMob(MobID.BELLSPROUT));
			}
			else if(i > 95 && i < 175){
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
