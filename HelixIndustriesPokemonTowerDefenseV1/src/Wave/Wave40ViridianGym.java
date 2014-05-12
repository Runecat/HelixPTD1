package Wave;

import java.awt.image.BufferedImage;

import Mob.Arbok;
import Mob.Dugtrio;
import Mob.Machoke;
import Mob.Machop;
import Mob.MobBuilder;
import Mob.MobID;
import Mob.Nidoking;
import Mob.Rhydon;
import Mob.Rhyhorn;
import Mob.Tauros;

public class Wave40ViridianGym extends Wave{

	private int delay = 750;
	private int level = 40;
	
	public Wave40ViridianGym(){
		super();
		MobBuilder m = super.mobBuilder;
		for(int i = 0; i < 3000; i++){
			if(i < 2250){
				if(i % 17 == 0)
					add(m.buildMob(MobID.NIDOKING));
				else if(i % 11 == 0)
					add(m.buildMob(MobID.TAUROS));
				else if(i % 6 == 0)
					add(m.buildMob(MobID.MACHOKE));
				else if(i % 5 == 0)
					add(m.buildMob(MobID.DUGTRIO));					
				else if (i % 3 == 0)
					add(m.buildMob(MobID.ARBOK));
				else if(i % 2== 0)
					add(m.buildMob(MobID.MACHOP));
				else
					add(m.buildMob(MobID.RHYHORN));
				}
			else{
				if(i % 4 == 0)
					add(m.buildMob(MobID.NIDOKING));
				else if(i % 3 == 0)
					add(m.buildMob(MobID.DUGTRIO));
				else if(i % 2 == 0)
					add(m.buildMob(MobID.RHYDON));
				else
					add(m.buildMob(MobID.RHYHORN));
			}
			
		}
	}
	
}
