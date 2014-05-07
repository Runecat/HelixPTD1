package Wave;

import java.awt.image.BufferedImage;

import Mob.Pidgeotto;
import Mob.Pidgey;
import Mob.Raticate;
import Mob.Rattata;
import Mob.Tangela;

public class Wave37 extends Wave{

	private int delay = 500;
	private int level = 37;
		
	private BufferedImage pidgey;
	private BufferedImage pidgeotto;
	private BufferedImage rattata;
	private BufferedImage raticate;
	private BufferedImage tangela;

	public Wave37(){
	super();
	for(int i = 0; i < 1600; i++){
		if(i % 5 == 0)
			add(new Pidgey(pidgey));
		else if(i % 4 == 0)
			add(new Pidgeotto(pidgeotto));
		else if(i % 3 == 0)
			add(new Rattata(rattata));
		else if(i % 2 == 0)
			add(new Raticate(raticate));
		else 
			add(new Tangela(tangela));
	}
	}
}
