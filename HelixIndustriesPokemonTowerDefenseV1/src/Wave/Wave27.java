package Wave;

import java.awt.image.BufferedImage;

import Mob.Dodrio;
import Mob.Doduo;
import Mob.Fearow;
import Mob.Raticate;
import Mob.Spearow;

public class Wave27 extends Wave{

	private int delay = 500;
	private int level = 27;
	
	private BufferedImage spearow;
	private BufferedImage raticate;
	private BufferedImage doduo;
	private BufferedImage fearow;
	private BufferedImage dotrio;
	
	public Wave27(){
		super();
		for(int i = 0; i < 900; i++){
			if(i % 5 == 0)
				add(new Dodrio(dotrio));
			else if(i % 4 == 0)
				add(new Fearow(fearow));
			else if(i % 3 == 0)
				add(new Raticate(raticate));
			else if(i % 2 == 0)
				add(new Doduo(doduo));
			else
				add(new Spearow(spearow));
		}
	}
}
