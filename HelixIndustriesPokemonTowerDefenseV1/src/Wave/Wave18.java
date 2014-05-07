package Wave;

import java.awt.image.BufferedImage;

import Mob.Ekans;
import Mob.Jigglypuff;
import Mob.Kadabra;
import Mob.Mankey;
import Mob.Meowth;
import Mob.Pidgey;
import Mob.Vulpix;

public class Wave18 extends Wave{

	private int delay = 500;
	private int level = 18;
	
	private BufferedImage pidgey;
	private BufferedImage mankey;
	private BufferedImage meowth;
	private BufferedImage ekans;
	private BufferedImage vulpix;
	private BufferedImage jigglypuff;
	private BufferedImage kadabra;
	
	public Wave18(){
		super();
		for(int i = 0; i < 330; i++){
			if(i % 17 == 0)
				add(new Jigglypuff(jigglypuff));
			else if(i % 27 == 0)
				add(new Kadabra(kadabra));
			else if(i % 5 == 0)
				add(new Pidgey(pidgey));
			else if (i % 4 == 0)
				add(new Mankey(mankey));
			else if(i % 3 == 0)
				add(new Meowth(meowth));
			else if(i % 2 == 0)
				add(new Ekans(ekans));
			else
				add(new Vulpix(vulpix));
		}
	}
}
