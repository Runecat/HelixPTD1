package Wave;

import java.awt.image.BufferedImage;

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
					add(new Voltorb(voltorb));
				else
					add(new Magnemite(magnemite));
			}
			else{
				if(i % 7 == 0)
					add(new RaichuMob(raichu));
				else if (i % 2 == 0)
					add(new PikachuMob(pikachu));
				else
					add(new Magnemite(magnemite));
			}
		}
	}
	
}
