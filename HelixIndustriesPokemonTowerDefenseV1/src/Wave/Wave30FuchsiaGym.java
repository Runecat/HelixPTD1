package Wave;

import java.awt.image.BufferedImage;

import Mob.Arbok;
import Mob.Drowzee;
import Mob.Hypno;
import Mob.Kadabra;
import Mob.Koffing;
import Mob.Muk;
import Mob.Weezing;

public class Wave30FuchsiaGym extends Wave{

	private int delay = 500;
	private int level = 30;
	
	private BufferedImage drowzee;
	private BufferedImage hypno;
	private BufferedImage kadabra;
	private BufferedImage arbok;
	private BufferedImage koffing;
	private BufferedImage weezing;
	private BufferedImage muk;
	
	public Wave30FuchsiaGym(){
		super();
		for(int i = 0; i < 1200; i++){
			if(i < 900){
				if(i % 7 == 0)
					add(new Arbok(arbok));
				else if(i % 11 == 0)
					add(new Kadabra(kadabra));
				else if(i % 3 == 0)
					add(new Hypno(hypno));
				else
					add(new Drowzee(drowzee));
			}
			else{
				if (i % 5 == 0)
					add(new Muk(muk));
				else if(i % 4 ==0)
					add(new Weezing(weezing));
				else
					add(new Koffing(koffing));
			}	
		}
	}
}
