package Wave;

import java.awt.image.BufferedImage;

import Mob.Goldeen;
import Mob.Poliwag;
import Mob.Shellder;
import Mob.Staryu;
import Mob.Tentacool;
import Mob.Tentacruel;

public class Wave31 extends Wave{

	private int delay = 500;
	private int level = 31;
	
	private BufferedImage staryu;
	private BufferedImage tentacruel;
	private BufferedImage poliwag;
	private BufferedImage goldeen;
	private BufferedImage shellder;
	private BufferedImage tentacool;

	public Wave31(){
		super();
		for(int i = 0; i < 1100; i++){
			if(i % 27 == 0)
				add(new Tentacruel(tentacruel));
			else if(i % 5 == 0)
				add(new Tentacool(tentacool));
			else if(i % 4 == 0)
				add(new Shellder(shellder));
			else if(i % 3 == 0)
				add(new Goldeen(goldeen));
			else if(i % 2 == 0)
				add(new Poliwag(poliwag));
			else 
				add(new Staryu(staryu));
		}
	}
	
}
