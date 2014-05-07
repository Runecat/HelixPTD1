package Wave;

import java.awt.image.BufferedImage;

import Mob.Ekans;
import Mob.Goldeen;
import Mob.Poliwag;
import Mob.Psyduck;
import Mob.Spearow;

public class Wave09 extends Wave{

	private int delay = 1000;
	private int level = 9;
	
	private BufferedImage poliwag;
	private BufferedImage psyduck;
	private BufferedImage ekans;
	private BufferedImage spearow;
	private BufferedImage goldeen;
	
	public Wave09(){
		super();
		for(int i = 0; i < 110; i++){
			if(i < 35){
				if(i % 2 == 0)
					add(new Ekans(ekans));
				else
					add(new Spearow(spearow));
			}
			else{
				if(i % 2 == 0)
					add(new Goldeen(poliwag));
				else if(i % 3 == 0)
					add(new Psyduck(psyduck));
				else
					add(new Poliwag(goldeen));
			}
		}
	}
}
