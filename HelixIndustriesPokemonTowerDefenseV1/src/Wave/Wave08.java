package Wave;

import java.awt.image.BufferedImage;

import Mob.Zubat;

public class Wave08 extends Wave{

	private int delay = 100;
	private int level = 8;
	
	private BufferedImage zubat;
	
	public Wave08(){
		super();
		for(int i = 0; i < 150; i++)
			add(new Zubat(zubat));
			
	}
}
