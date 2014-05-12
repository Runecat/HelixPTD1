package Wave;

import java.awt.image.BufferedImage;

import Mob.Alakazam;
import Mob.Gastly;
import Mob.Haunter;
import Mob.Kadabra;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.MrMime;
import Mob.Slowpoke;

public class Wave25SaffronGym extends Wave{

	private int delay = 500;
	private int level = 25;

	public Wave25SaffronGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 800; i++){
			if(i < 500){
				if(i % 5 == 0)
					add(m.buildMob(MobID.KADABRA));
				else if(i % 4 == 0)
					add(m.buildMob(MobID.HAUNTER));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.GASTLY));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.MRMIME));
				else
					add(m.buildMob(MobID.SLOWPOKE));
			}
			else{
				if(i % 3 == 0)
					add(m.buildMob(MobID.ALAKAZAM));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.MRMIME));
				else
					add(m.buildMob(MobID.KADABRA));
			}
		}
	}
}
