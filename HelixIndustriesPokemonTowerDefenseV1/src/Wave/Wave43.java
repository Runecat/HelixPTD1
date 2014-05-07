package Wave;

import java.awt.image.BufferedImage;

import Mob.GravelerMob;
import Mob.Machop;
import Mob.Marowak;
import Mob.Onix;
import Mob.Zubat;

public class Wave43 extends Wave{

	private int delay = 400;
	private int level = 43;
	
	private BufferedImage onix;
	private BufferedImage zubat;
	private BufferedImage machop;
	private BufferedImage graveler;
	private BufferedImage marowak;
	
	public Wave43(){
		super();
		for(int i = 0; i < 2750; i++){
			if(i % 8 == 0)
				add(new Onix(onix));
			else if(i % 7 == 0)
				add(new Machop(machop));
			else if(i % 6 == 0)
				add(new GravelerMob(graveler));
			else if(i % 5 == 0)
				add(new Marowak(marowak));
			else
				add(new Zubat(zubat));
		}
	}

}