package Wave;

import java.awt.image.BufferedImage;

import Mob.Voltorb;
import Mob.Magnemite;
import Mob.Machop;

public class Wave13 extends Wave{
	
	private int delay = 250;
	private int level = 13;
	
	private BufferedImage voltorb;
	private BufferedImage magnemite;
	private BufferedImage machop;
	
	public Wave13(){
		for(int i = 0; i < 250; i++){
			if(i % 5 == 0)
				add(new Machop(machop));
			else if(i % 2 == 0)
				add(new Voltorb(voltorb));
			else
				add(new Magnemite(magnemite));
		}
	}

}
