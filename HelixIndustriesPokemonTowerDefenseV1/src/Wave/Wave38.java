package Wave;

import java.awt.image.BufferedImage;

import Mob.Pidgey;
import Mob.Rattata;

public class Wave38 extends Wave{

	private int delay = 100;
	private int level = 38;
	
	private BufferedImage rattata;
	private BufferedImage pidgey;
	
	public Wave38(){
		super();
		for(int i = 0; i < 2000; i++){
			if(i % 2 == 0)
				add(new Rattata(rattata));
			else
				add(new Pidgey(pidgey));
		}
	}
}
