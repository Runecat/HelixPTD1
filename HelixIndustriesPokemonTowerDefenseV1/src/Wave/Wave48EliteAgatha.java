package Wave;

import java.awt.image.BufferedImage;

import Mob.EliteArbok;
import Mob.Gengar;
import Mob.EliteHaunter;
import Mob.Golbat;

public class Wave48EliteAgatha extends Wave{

	private int delay = 444;
	private int level = 48;
	
	private BufferedImage gengar;
	private BufferedImage eliteHaunter;
	private BufferedImage eliteArbok;
	private BufferedImage golbat;
	
	public Wave48EliteAgatha(){
		super();
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(new EliteHaunter(eliteHaunter));
			else if(i % 3 == 0)
				add(new EliteArbok(eliteArbok));
			else if(i % 2 == 0)
				add(new Golbat(golbat));
			else
				add(new Gengar(gengar));
		}
	}
}
