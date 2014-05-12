package Wave;

import java.awt.image.BufferedImage;

import Mob.Caterpie;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Weedle;

public class Wave04 extends Wave{
	private int delay = 1000;
	private int level = 3;
	
	private BufferedImage rattata;
	private BufferedImage pidgey;
	private BufferedImage weedle;
	private BufferedImage caterpie;

	public Wave04(){
		super();
		for(int i = 0; i < 35; i++){
			if(i < 25)
				if(i % 2 == 0)
					add(new Rattata(rattata));
				else
					add(new Pidgey(pidgey));
			else
				if(i % 2 == 0)
					add(new Weedle(weedle));
				else
					add(new Caterpie(caterpie));
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
