package Wave;

import java.awt.image.BufferedImage;

import Mob.Bellsprout;
import Mob.Exeggcute;
import Mob.Oddish;
import Mob.Tangela;
import Mob.Victreebell;
import Mob.Weepinbell;
import Mob.Vileplume;

public class Wave20CeladonGym extends Wave{

	private int delay = 500;
	private int level = 20;
	
	private BufferedImage oddish;
	private BufferedImage weepinbell;
	private BufferedImage gloom;
	private BufferedImage bellsprout;
	private BufferedImage exeggcute;
	private BufferedImage victreebell;
	private BufferedImage tangela;
	private BufferedImage vileplume;
	
	public Wave20CeladonGym(){
		super();
		for(int i = 0; i < 550; i++){
			if(i < 400){
				if(i % 19 == 0)
					add(new Exeggcute(exeggcute));
				else if(i % 11 == 0)
					add(new Weepinbell(weepinbell));
				else if(i % 2 == 0)
					add(new Oddish(oddish));
				else
					add(new Bellsprout(bellsprout));
			}
			else{
				if(i % 3 == 0)
					add(new Victreebell(victreebell));
				else if(i % 2 == 0)
					add(new Tangela(tangela));
				else
					add(new Vileplume(vileplume));
			}
		}
	}

}
