package Wave;

import java.awt.image.BufferedImage;

import Mob.Arcanine;
import Mob.Growlithe;
import Mob.Ninetales;
import Mob.Ponyta;
import Mob.Rapidash;
import Mob.Vulpix;

public class Wave35CinnabarGym extends Wave{

	private int delay = 250;
	private int level = 35;
	
	private BufferedImage rapidash;
	private BufferedImage growlithe;
	private BufferedImage vulpix;
	private BufferedImage ninetales;
	private BufferedImage ponyta;
	private BufferedImage arcanine;
	
	public Wave35CinnabarGym(){
		super();
		for(int i = 0; i < 1700; i++){
			if(i < 2000){
				if(i % 17 == 0)
					add(new Rapidash(rapidash));
				else if(i % 11 == 0)
					add(new Ninetales(ninetales));
				else if(1 % 3 == 0)
					add(new Vulpix(vulpix));
				else if(i % 2 == 0)
					add(new Ponyta(ponyta));
				else
					add(new Growlithe(growlithe));
			}
			else{
				if(i % 4 == 0)
					add(new Growlithe(growlithe));
				else if(i % 3 == 0)
					add(new Ponyta(ponyta));
				else if(i % 2 == 0)
					add(new Rapidash(rapidash));
				else
					add(new Arcanine(arcanine));
			}
		}
	}
}
