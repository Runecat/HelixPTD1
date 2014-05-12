package Wave;

import java.awt.image.BufferedImage;

import Mob.MobBuilder;
import Mob.MobID;
import Mob.Zubat;

public class Wave08 extends Wave{

	private int delay = 100;
	private int level = 8;
	
	public Wave08(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 150; i++)
			add(m.buildMob(MobID.ZUBAT));
			
	}
}
