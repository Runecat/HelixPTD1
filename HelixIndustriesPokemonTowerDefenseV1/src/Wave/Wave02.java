package Wave;

import java.util.ArrayList;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;

public class Wave02 {
	private Wave wave2 = new Wave();
	private Mob mob;
		
	public Wave02(){
		for(int i = 0; i < 15; i++){
			if(i % 2 == 0)
				wave2.add(new Rattata());
			else
				wave2.add(new Pidgey());
		}
	}
}

