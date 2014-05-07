package Wave;

import java.awt.image.BufferedImage;

import Mob.BlastoiseMob;
import Mob.CharizardMob;
import Mob.EliteAlakazam;
import Mob.EliteExeggutor;
import Mob.EliteRhydon;
import Mob.Gyarados;
import Mob.Pidgeot;
import Mob.VenusaurMob;

public class Wave50ChampionBlue extends Wave{

	private int delay = 444;
	private int level = 46;
	
	private BufferedImage gyarados;
	private BufferedImage pidgeot;
	private BufferedImage eliteAlakazam;
	private BufferedImage eliteExeggutor;
	private BufferedImage eliteRhydon;
	private BufferedImage blastoise;
	private BufferedImage venusaur;
	private BufferedImage charizard;

	public Wave50ChampionBlue(){
		super();
		for(int i = 0; i < 4500; i++){
			if(i % 8 == 0)
				add(new Gyarados(gyarados));
			else if(i % 8 == 0)
				add(new Pidgeot(pidgeot));
			else if(i % 6 == 0)
				add(new CharizardMob(charizard));
			else if(i % 5 == 0)
				add(new EliteAlakazam(eliteAlakazam));
			else if(i % 4 == 0)
				add(new VenusaurMob(venusaur));
			else if(i % 3 == 0)
				add(new BlastoiseMob(blastoise));
			else if(i % 2 == 0)
				add(new EliteRhydon(eliteRhydon));
			else
				add(new EliteExeggutor(eliteExeggutor));
		}
	}
}
