package Wave;

import java.awt.image.BufferedImage;

import Mob.Doduo;
import Mob.Fearow;
import Mob.Rattata;
import Mob.Spearow;

public class Wave21 extends Wave{

	private int delay = 500;
	private int level = 21;
	
	private BufferedImage fearow;
	private BufferedImage doduo;
	private BufferedImage spearow;
	private BufferedImage rattata;

	public Wave21(){
		super();
		for(int i = 0; i < 500; i++){
			if(i % 4 == 0)
				add(new Fearow(fearow));
			else if(i % 3 == 0)
				add(new Spearow(spearow));
			else if(i % 2 == 0)
				add(new Doduo(doduo));
			else
				add(new Rattata(rattata));
		}
	}
}
