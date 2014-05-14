package Wave;

import java.awt.image.BufferedImage;

import Mob.Goldeen;
import Mob.Horsea;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Poliwag;
import Mob.Snorlax;
import Mob.Tentacool;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class Wave17 extends Wave{

	private int delay = 500;
	private int level = 17;
	
	public Wave17(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 275; i++){
			if(i % 4 == 0)
				add(m.buildMob(MobID.TENTACOOL));
			else if(i % 3 == 0)
				add(m.buildMob(MobID.GOLDEEN));
			else if(i % 2 == 0)
				add(m.buildMob(MobID.HORSEA));
			else
				add(m.buildMob(MobID.POLIWAG));
		}
		add(m.buildMob(MobID.SNORLAX));
	}
}
