package Wave;

import java.awt.image.BufferedImage;

import Mob.Mankey;
import Mob.Nidorino;
import Mob.Rattata;
import Mob.Spearow;

public class Wave41 extends Wave{

	private int delay = 400;
	private int level = 41;
	
	private BufferedImage rattata;
	private BufferedImage nidorino;
	private BufferedImage spearow;
	private BufferedImage mankey;
	
	public Wave41(){
		super();
		for(int i = 0; i < 3000; i++){
			if(i % 5 == 0)
				add(new Rattata(rattata));					
			else if (i % 3 == 0)
				add(new Nidorino(nidorino));
			else if(i % 2== 0)
				add(new Spearow(spearow));
			else
				add(new Mankey(mankey));
		}
	}
	
}
