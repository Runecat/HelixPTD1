package Wave;

import java.awt.image.BufferedImage;

import Mob.Articuno;
import Mob.Golduck;
import Mob.Kingler;
import Mob.Seel;
import Mob.Zubat;

public class Wave33 extends Wave{

	private int delay = 500;
	private int level = 33;
	
	private BufferedImage zubat;
	private BufferedImage golduck;
	private BufferedImage seel;
	private BufferedImage kingler;
	private BufferedImage articuno;

	public Wave33(){
		super();
		for(int i = 0; i < 1999; i++){
			if(i < 400)
				add(new Zubat(zubat));
			else if(i >= 400 && i < 800){
				if(i % 3 == 0)
					add(new Kingler(kingler));
				else if(i % 2 == 0)
					add(new Seel(seel));
				else
					add(new Golduck(golduck));
			}
			else if(i >= 800 && i < 1400)
				add(new Zubat(zubat));
			else{
				if(i % 4 == 0)
					add(new Kingler(kingler));
				else if(i % 3 == 0)
					add(new Zubat(zubat));
				else if(i % 2 == 0)
					add(new Seel(seel));
				else
					add(new Golduck(golduck));
			}
		}
		add(new Articuno(articuno));
	}
}
