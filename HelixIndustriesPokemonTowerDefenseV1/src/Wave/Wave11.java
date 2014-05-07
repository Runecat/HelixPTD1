package Wave;

import java.awt.image.BufferedImage;
import Mob.Oddish;
import Mob.Bellsprout;
import Mob.Venonat;
import Mob.Pidgeotto;
import Mob.Weedle;
import Mob.Caterpie;
import Mob.Pidgey;

public class Wave11 extends Wave{

	private int delay = 1000;
	private int level = 11;
	
	private BufferedImage oddish;
	private BufferedImage bellsprout;
	private BufferedImage venonat;
	private BufferedImage pidgeotto;
	private BufferedImage weedle;
	private BufferedImage caterpie;
	private BufferedImage pidgey;
	
	public Wave11(){
		super();
		for(int i = 0; i < 150; i++){
			if(i < 25){
				if(i % 2 == 0)
					add(new Caterpie(caterpie));
				else
					add(new Weedle(weedle));
			}
			else if(i > 25 && i < 75){
				if(i % 2 == 0)
					add(new Oddish(oddish));
				else
					add(new Bellsprout(bellsprout));
			}
			else if(i > 75 && i < 145){
				if(i % 2 == 0)
					add(new Venonat(venonat));
				if(i % 3 == 0)
					add(new Oddish(oddish));
				else
					add(new Bellsprout(bellsprout));
			}
			else
				add(new Pidgeotto(pidgeotto));
		}
	}
}
