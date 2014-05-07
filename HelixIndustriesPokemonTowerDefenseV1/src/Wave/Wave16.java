package Wave;

import java.awt.image.BufferedImage;

import Mob.Drowzee;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;

public class Wave16 extends Wave{

	private int delay = 500;
	private int level = 16;
	
	private BufferedImage spearow;
	private BufferedImage drowzee;
	private BufferedImage pidgey;
	private BufferedImage sandshrew;
	private BufferedImage rattata;

	public Wave16(){
		super();
		for(int i = 0; i < 250; i++){ 
			if(i % 5 == 0)
				add(new Spearow(spearow));
			else if(i % 4 == 0)
				add(new Drowzee(drowzee));
			else if(i % 3 == 0)
				add(new  Pidgey(pidgey));
			else if(i % 2 == 0)
				add(new Sandshrew(sandshrew));
			else
				add(new Rattata(rattata));
		}
	}
}
