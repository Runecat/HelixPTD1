package Wave;

import java.awt.image.BufferedImage;

import Mob.Spearow;
import Mob.Ekans;
import Mob.Psyduck;
import Mob.Poliwag;
import Mob.Goldeen;

public class Wave08 extends Wave{

	private int delay = 1000;
	private int level = 8;
	
	private BufferedImage poliwag;
	private BufferedImage psyduck;
	private BufferedImage ekans;
	private BufferedImage spearow;
	private BufferedImage goldeen;
	
	public Wave08(){
		super();
		for(int i = 0; i < 90; i++){
			if(i < 25){
				if(i % 3 != 0)
					add(new Ekans(ekans));
				else
					add(new Spearow(spearow));
			}
			else{
				if(i % 3 == 0)
					add(new Poliwag(poliwag));
				else if(i % 2 == 0)
					add(new Psyduck(psyduck));
				else
					add(new Goldeen(goldeen));
			}
		}
	}
}
