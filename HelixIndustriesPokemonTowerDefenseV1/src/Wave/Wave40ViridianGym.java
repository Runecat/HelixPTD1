package Wave;

import java.awt.image.BufferedImage;

import Mob.Arbok;
import Mob.Dugtrio;
import Mob.Machoke;
import Mob.Machop;
import Mob.Nidoking;
import Mob.Rhydon;
import Mob.Rhyhorn;
import Mob.Tauros;

public class Wave40ViridianGym extends Wave{

	private int delay = 750;
	private int level = 40;
	
	private BufferedImage nidorino;
	private BufferedImage nidoking;
	private BufferedImage tauros;
	private BufferedImage dugtrio;
	private BufferedImage rhyhorn;
	private BufferedImage rhydon;
	private BufferedImage machop;
	private BufferedImage machoke;
	private BufferedImage arbok;

	
	public Wave40ViridianGym(){
		super();
		for(int i = 0; i < 3000; i++){
			if(i < 2250){
				if(i % 17 == 0)
					add(new Nidoking(nidoking));
				else if(i % 11 == 0)
					add(new Tauros(tauros));
				else if(i % 6 == 0)
					add(new Machoke(machoke));
				else if(i % 5 == 0)
					add(new Dugtrio(dugtrio));					
				else if (i % 3 == 0)
					add(new Arbok(arbok));
				else if(i % 2== 0)
					add(new Machop(machop));
				else
					add(new Rhyhorn(rhyhorn));
				}
			else{
				if(i % 4 == 0)
					add(new Nidoking(nidoking));
				else if(i % 3 == 0)
					add(new Dugtrio(dugtrio));
				else if(i % 2 == 0)
					add(new Rhydon(rhydon));
				else
					add(new Rhyhorn(rhyhorn));
			}
			
		}
	}
	
}
