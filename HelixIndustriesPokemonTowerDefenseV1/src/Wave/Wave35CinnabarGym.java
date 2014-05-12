package Wave;

import java.awt.image.BufferedImage;

import Mob.Arcanine;
import Mob.Growlithe;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Ninetales;
import Mob.Ponyta;
import Mob.Rapidash;
import Mob.Vulpix;

public class Wave35CinnabarGym extends Wave{

	private int delay = 250;
	private int level = 35;
	
	public Wave35CinnabarGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 1700; i++){
			if(i < 2000){
				if(i % 17 == 0)
					add(m.buildMob(MobID.RAPIDASH));
				else if(i % 11 == 0)
					add(m.buildMob(MobID.NINETALES));
				else if(1 % 3 == 0)
					add(m.buildMob(MobID.VULPIX));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.PONYTA));
				else
					add(m.buildMob(MobID.GROWLITHE));
			}
			else{
				if(i % 4 == 0)
					add(m.buildMob(MobID.GROWLITHE));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.PONYTA));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.RAPIDASH));
				else
					add(m.buildMob(MobID.ARCANINE));
			}
		}
	}
}
