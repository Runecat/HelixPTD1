package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Shellder;
import Mob.Horsea;
import Mob.Starmie;
import Mob.Staryu;
import Mob.Goldeen;

public class Wave10CeruleanGym extends Wave{
	private int delay = 500;
	private int level = 10;
	
	public Wave10CeruleanGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 125; i++){
			if(i < 55){
				if(i % 2 == 0)
					add(m.buildMob(MobID.SHELLDER));
				else
					add(m.buildMob(MobID.HORSEA));
			}
			else if(i >= 55 && i < 60)
				add(m.buildMob(MobID.GOLDEEN));
			else{
				if(i >= 60 && i < 120){
					if(i % 3 == 0)
						add(m.buildMob(MobID.GOLDEEN));
					else
						add(m.buildMob(MobID.STARYU));
				}
			else
				add(m.buildMob(MobID.STARMIE));
			}
		}
	}
}
