package Wave;

import java.awt.image.BufferedImage;

import Mob.Jigglypuff;
import Mob.Mankey;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;

public class Wave06 extends Wave{
	private int delay = 1000;
	private int level = 4;
	
	private BufferedImage rattata;
	private BufferedImage pidgey;
	private BufferedImage spearow;
	private BufferedImage sandshrew;
	private BufferedImage mankey;
	private BufferedImage jigglypuff;

	
	public Wave06(){
		super();
		for(int i = 0; i < 65; i++){
			if(i < 5){
				if(i % 2 == 0)
					add(new Rattata(rattata));
				else
					add(new Pidgey(pidgey));
			}
			else if (i >= 5 && i < 45){
				if(i % 2 == 0)
					add(new Pidgey(pidgey));
				else
					add(new Spearow(spearow));
			}
			else if(i >= 45 && i < 64){
				if(i % 2 == 0)
					add(new Mankey(mankey));
				else
					add(new Sandshrew(sandshrew));
			}
			else
				add(new Jigglypuff(jigglypuff));
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

