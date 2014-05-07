package Wave;

import java.awt.image.BufferedImage;

import Mob.Gyarados;
import Mob.Dragonite;
import Mob.Dragonair;
import Mob.Aerodactyl;

public class Wave49EliteLance extends Wave{

	private int delay = 444;
	private int level = 49;
	
	private BufferedImage dragonair;
	private BufferedImage dragonite;
	private BufferedImage gyarados;
	private BufferedImage aerodactyl;
	
	public Wave49EliteLance(){
		super();
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(new Dragonite(dragonite));
			else if(i % 3 == 0)
				add(new Gyarados(gyarados));
			else if(i % 2 == 0)
				add(new Aerodactyl(aerodactyl));
			else
				add(new Dragonair(dragonair));
		}
	}
}
