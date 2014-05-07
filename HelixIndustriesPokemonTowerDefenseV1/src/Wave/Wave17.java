package Wave;

import java.awt.image.BufferedImage;

import Mob.Goldeen;
import Mob.Horsea;
import Mob.Poliwag;
import Mob.Snorlax;
import Mob.Tentacool;

public class Wave17 extends Wave{

	private int delay = 500;
	private int level = 17;
	
	private BufferedImage tentacool;
	private BufferedImage goldeen;
	private BufferedImage horsea;
	private BufferedImage poliwag;
	private BufferedImage snorlax;
	
	public Wave17(){
		super();
		for(int i = 0; i < 275; i++){
			if(i % 4 == 0)
				add(new Tentacool(tentacool));
			else if(i % 3 == 0)
				add(new Goldeen(goldeen));
			else if(i % 2 == 0)
				add(new Horsea(horsea));
			else
				add(new Poliwag(poliwag));
		}
		add(new Snorlax(snorlax));
	}
}
