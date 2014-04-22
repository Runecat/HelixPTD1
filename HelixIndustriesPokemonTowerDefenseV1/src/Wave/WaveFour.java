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

public class WaveFour {

	private ArrayList<Mob> wave4;
	private Mob mob;
		
	public WaveFour(){
		for(int i = 0; i < 35; i++){
			if(i < 5){
				if(i % 2 == 0)
					wave4.add(i, new Rattata());
				else
					wave4.add(i, new Pidgey());
			}
			else if (i > 5 && i < 30){
				if(i % 2 == 0)
					wave4.add(i, new Pidgey());
				else
					wave4.add(i, new Spearow());
			}
			else if(i > 30 && i < 35){
				if(i % 2 == 0)
					wave4.add(i, new Mankey());
				else
					wave4.add(i, new Sandshrew());
			}
			else
				wave4.add(i, new Jigglypuff());
		}
	}
}

