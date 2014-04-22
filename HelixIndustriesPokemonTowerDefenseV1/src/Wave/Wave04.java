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

public class Wave04 extends Wave{

	private Mob mob;
		
	public Wave04(){
		super();
		for(int i = 0; i < 35; i++){
			if(i < 5){
				if(i % 2 == 0)
					add(new Rattata());
				else
					add(new Pidgey());
			}
			else if (i > 5 && i < 30){
				if(i % 2 == 0)
					add(new Pidgey());
				else
					add(new Spearow());
			}
			else if(i > 30 && i < 35){
				if(i % 2 == 0)
					add(new Mankey());
				else
					add(new Sandshrew());
			}
			else
				add(new Jigglypuff());
		}
	}
}

