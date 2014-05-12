package Wave;

import java.awt.image.BufferedImage;

import Mob.Arbok;
import Mob.Drowzee;
import Mob.Hypno;
import Mob.Kadabra;
import Mob.Koffing;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Muk;
import Mob.Venomoth;
import Mob.Weezing;

public class Wave30FuchsiaGym extends Wave{

	private int delay = 500;
	private int level = 30;
	
	public Wave30FuchsiaGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 1200; i++){
			if(i < 900){
				if(i % 7 == 0)
					add(m.buildMob(MobID.ARBOK));
				else if(i % 11 == 0)
					add(m.buildMob(MobID.KADABRA));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.HYPNO));
				else
					add(m.buildMob(MobID.DROWZEE));
			}
			else{
				if (i % 5 == 0)
					add(m.buildMob(MobID.MUK));
				else if(i % 4 == 0)
					add(m.buildMob(MobID.WEEZING));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.VENOMOTH));
				else
					add(m.buildMob(MobID.KOFFING));
			}	
		}
	}
}
