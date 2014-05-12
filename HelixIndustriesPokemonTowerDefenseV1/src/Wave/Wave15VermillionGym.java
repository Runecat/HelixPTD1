package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.PikachuMob;
import Mob.RaichuMob;
import Mob.Voltorb;
import Mob.Magnemite;


public class Wave15VermillionGym extends Wave {

	private int delay = 500;
	private int level = 15;
	public Wave15VermillionGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 275; i++){
			if(i < 175){
				if(i % 2 == 0)
					add(m.buildMob(MobID.VOLTORB));
				else
					add(m.buildMob(MobID.MAGNEMITE));
			}
			else{
				if(i % 7 == 0)
					add(m.buildMob(MobID.RAICHU));
				else if (i % 2 == 0)
					add(m.buildMob(MobID.PIKACHU));
				else
					add(m.buildMob(MobID.MAGNEMITE));
			}
		}
	}
	
}
