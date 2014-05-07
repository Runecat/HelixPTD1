package Wave;

import java.awt.image.BufferedImage;

import Mob.Hitmonchan;
import Mob.Dewgong;
import Mob.EliteOnix;
import Mob.Hitmonlee;
import Mob.Machamp;

public class Wave47EliteBruno extends Wave{

	private int delay = 444;
	private int level = 47;
	
	private BufferedImage eliteOnix;
	private BufferedImage hitmonlee;
	private BufferedImage hitmonchan;
	private BufferedImage machamp;
	
	public Wave47EliteBruno(){
		super();
		for(int i = 0; i < 4000; i++){
			if(i % 4 == 0)
				add(new Hitmonlee(hitmonlee));
			else if(i % 3 == 0)
				add(new Hitmonchan(hitmonchan));
			else if(i % 2 == 0)
				add(new Machamp(machamp));
			else
				add(new EliteOnix(eliteOnix));
		}
	}
}
