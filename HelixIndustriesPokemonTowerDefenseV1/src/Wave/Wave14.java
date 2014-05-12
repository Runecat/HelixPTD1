package Wave;

import java.awt.image.BufferedImage;
import Mob.Oddish;
import Mob.Bellsprout;
import Mob.Pidgey;
import Mob.Venonat;
import Mob.Gloom;
import Mob.Pidgeotto;
import Mob.Weepinbell;
import Mob.Goldeen;
import Mob.Horsea;
import Mob.Poliwag;


public class Wave14 extends Wave{

	private int delay = 750;
	private int level = 14;
	
	public Wave14(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 250; i++){
			if(i < 50){
				if(i % 3 == 0)
					add(new Oddish(oddish));
				else if (i % 2 == 0)
					add(new Bellsprout(bellsprout));
				else
					add(new Pidgey(pidgey));
			}
			else if(i >= 50 && i < 150 || i >= 225){
				if(i % 4 == 0)
					add(new Venonat(venonat));
				else if(i % 3 == 0)
					add(new Gloom(gloom));
				else if(i % 2 == 0)
					add(new Weepinbell(weepinbell));
				else
					add(new Pidgeotto(pidgeotto));
			}
			else{
				if(i % 3 == 0)
					add(new Goldeen(goldeen));
				else if(i % 2 == 0)
					add(new Horsea(horsea));
				else
					add(new Poliwag(poliwag));
			}
		}
	}

}
