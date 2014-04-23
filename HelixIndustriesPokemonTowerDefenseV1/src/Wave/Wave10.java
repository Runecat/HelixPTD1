package Wave;

import java.awt.image.BufferedImage;
import Mob.Shellder;
import Mob.Horsea;
import Mob.Starmie;
import Mob.Staryu;
import Mob.Goldeen;

public class Wave10 extends Wave{
	private int delay = 500;
	private int level = 4;
	
	private BufferedImage shellder;
	private BufferedImage horsea;
	private BufferedImage starmie;
	private BufferedImage staryu;
	private BufferedImage goldeen;
	
	public Wave10(){
		super();
		for(int i = 0; i < 125; i++){
			if(i < 55){
				if(i % 2 == 0)
					add(new Shellder(shellder));
				else
					add(new Horsea(horsea));
			}
			else if(i >= 55 && i < 60)
				add(new Goldeen(goldeen));
			else{
				if(i >= 60 && i < 120){
					if(i % 3 == 0)
						add(new Goldeen(goldeen));
					else
						add(new Staryu(staryu));
				}
			else
				add(new Starmie(starmie));
			}
		}
	}
}
