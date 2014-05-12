package Wave;

import java.awt.image.BufferedImage;

import Mob.BlastoiseMob;
import Mob.CharizardMob;
import Mob.EliteAlakazam;
import Mob.EliteExeggutor;
import Mob.EliteRhydon;
import Mob.Gyarados;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Pidgeot;
import Mob.VenusaurMob;

public class Wave50ChampionBlue extends Wave{

	private int delay = 444;
	private int level = 46;
	
	

	public Wave50ChampionBlue(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 4500; i++){
			if(i % 8 == 0)
				add(m.buildMob(MobID.GYARADOS));
			else if(i % 8 == 0)
				add(m.buildMob(MobID.PIDGEOT));
			else if(i % 6 == 0)
				add(m.buildMob(MobID.CHARIZARD));
			else if(i % 5 == 0)
				add(m.buildMob(MobID.ELITE_ALAKAZAM));
			else if(i % 4 == 0)
				add(m.buildMob(MobID.VENASAUR));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.BLASTOISE));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.ELITE_RHYDON));
			else
				add(m.buildMob(MobID.ELITE_EXEGGUTOR));
		}
	}
}
