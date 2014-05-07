package Wave;

import java.awt.image.BufferedImage;

import Mob.Pidgey;
import Mob.Rattata;

public class Wave39 extends Wave{

	private int delay = 100;
	private int level = 39;
	
	private BufferedImage rattata;
	private BufferedImage pidgey;
	
	public Wave39(){
		super();
		for(int i = 0; i < 2200; i++){
			if(i % 2 == 0)
				add(new Rattata(rattata));
			else
				add(new Pidgey(pidgey));
		}
	}
}