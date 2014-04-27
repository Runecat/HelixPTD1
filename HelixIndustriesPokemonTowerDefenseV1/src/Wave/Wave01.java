package Wave;

import java.awt.image.BufferedImage;

import Mob.Pidgey;
import Mob.Rattata;

public class Wave01 extends Wave{
	private int delay = 1000;
	private int level = 1;
	
	private BufferedImage rattata;
	private BufferedImage pidgey;
	
	public Wave01(){
		super();
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0)
				add(new Rattata(rattata));
			else
				add(new Pidgey(pidgey));
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
