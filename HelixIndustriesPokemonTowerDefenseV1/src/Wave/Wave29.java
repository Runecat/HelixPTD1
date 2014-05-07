package Wave;

import java.awt.image.BufferedImage;

import Mob.Doduo;
import Mob.Fearow;
import Mob.Lickitung;
import Mob.Parasect;
import Mob.Raticate;
import Mob.Shellder;
import Mob.Spearow;
import Mob.Tentacool;

public class Wave29 extends Wave{

	private int delay = 500;
	private int level = 29;
	
	private BufferedImage spearow;
	private BufferedImage raticate;
	private BufferedImage doduo;
	private BufferedImage fearow;
	private BufferedImage shellder;
	private BufferedImage tentacool;
	private BufferedImage lickitung;
	private BufferedImage parasect;
	
	public Wave29(){
		super();
		for(int i = 0; i < 1050; i++){
			if(i % 13 == 0)
				add(new Parasect(parasect));
			else if(i % 11 == 0)
				add(new Lickitung(lickitung));
			else if(i % 6 == 0)
				add(new Tentacool(tentacool));
			else if(i % 5 == 0)
				add(new Shellder(shellder));
			else if(i % 4 == 0)
				add(new Fearow(fearow));
			else if(i % 3 == 0)
				add(new Doduo(doduo));
			else if(i % 2 == 0)
				add(new Raticate(raticate));
			else
				add(new Spearow(spearow));
		}
	}
	
}
