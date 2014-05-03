package Wave;

import java.awt.image.BufferedImage;
import Mob.Diglett;
import Mob.Geodude;
import Mob.Onix;
import Mob.Sandshrew;

public class Wave05PewterGym extends Wave{
	private int delay = 500;
	private int level = 5;
	
	private BufferedImage diglett;
	private BufferedImage geodude;
	private BufferedImage onix;
	private BufferedImage sandshrew;

	public Wave05PewterGym(){
		super();
		for(int i = 0; i < 50; i++){
			if(i < 25){
				if(i % 2 == 0)
					add(new Diglett(diglett));
				else
					add(new Sandshrew(sandshrew));
			}
			else if(i >= 25 && i < 49){
				if(i % 2 == 0)
					add(new Diglett(diglett));
				else
					add(new Geodude(geodude));
			}
			else
				add(new Onix(onix));
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
