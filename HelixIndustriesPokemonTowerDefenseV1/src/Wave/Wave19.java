package Wave;

import java.awt.image.BufferedImage;

import Mob.Ekans;
import Mob.Jigglypuff;
import Mob.Kadabra;
import Mob.Mankey;
import Mob.Meowth;
import Mob.Pidgey;
import Mob.Vulpix;

public class Wave19 extends Wave{

	private int delay = 500;
	private int level = 19;
	
	private BufferedImage pidgey;
	private BufferedImage mankey;
	private BufferedImage meowth;
	private BufferedImage ekans;
	private BufferedImage vulpix;
	private BufferedImage jigglypuff;
	private BufferedImage kadabra;
	
	public Wave19(){
		super();
		for(int i = 0; i < 400; i++){
			if(i % 17 == 0)
				add(new Jigglypuff(jigglypuff));
			else if(i % 20 == 0)
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