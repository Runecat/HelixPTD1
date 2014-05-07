package Wave;

import java.awt.image.BufferedImage;

import Mob.Bellsprout;
import Mob.Mankey;
import Mob.Meowth;
import Mob.Oddish;
import Mob.Vulpix;

public class Wave22 extends Wave{

	private int delay = 500;
	private int level = 22;
	
	private BufferedImage oddish;
	private BufferedImage bellsprout;
	private BufferedImage meowth;
	private BufferedImage mankey;
	private BufferedImage vulpix;
	
	public Wave22(){
		super();
		for(int i = 0; i < 550; i++){
			if(i % 5 == 0)
				add(new Oddish(oddish));
			else if(i % 4 == 0)
				add(new Bellsprout(bellsprout));
			else if(i % 3 == 0)
				add(new Meowth(meowth));
			else if(i % 2 == 0)
				add(new Mankey(mankey));
			else
				add(new Vulpix(vulpix));
		}
	}
}
