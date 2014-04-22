package Wave;

import java.util.ArrayList;

import Mob.Caterpie;
import Mob.Jigglypuff;
import Mob.Mankey;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;
import Mob.Spearow;
import Mob.Weedle;

public class Wave04 {

	private Wave wave4 = new Wave();
	private Mob mob;
		
	public Wave04(){
		for(int i = 0; i < 35; i++){
			if(i < 5){
				if(i % 2 == 0)
					wave4.add(new Rattata());
				else
					wave4.add(new Pidgey());
			}
			else if (i > 5 && i < 30){
				if(i % 2 == 0)
					wave4.add(new Pidgey());
				else
					wave4.add(new Spearow());
			}
			else if(i > 30 && i < 35){
				if(i % 2 == 0)
					wave4.add(new Mankey());
				else
					wave4.add(new Sandshrew());
			}
			else
				wave4.add(new Jigglypuff());
		}
	}
}

