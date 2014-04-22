package Wave;

import Mob.Diglett;
import Mob.Geodude;
import Mob.Mob;
import Mob.Onix;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Sandshrew;

public class Wave05 {
	private Wave wave5 = new Wave();
	private Mob mob;
		
	public Wave05(){
		for(int i = 0; i < 50; i++){
			if(i < 25){
				if(i % 2 == 0)
					wave5.add(new Diglett());
				else
					wave5.add(new Sandshrew());
			}
			else if(i > 25 && i < 49){
				if(i % 2 == 0)
					wave5.add(new Diglett());
				else
					wave5.add(new Geodude());
			}
			else
				wave5.add(new Onix());
		}
	}
}
