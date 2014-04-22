package Wave;

import java.util.ArrayList;

import Mob.Caterpie;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Weedle;

public class Wave03 {
	private Wave wave3 = new Wave();
	private Mob mob;
		
	public Wave03(){
		for(int i = 0; i < 25; i++){
			if(i < 15)
				if(i % 2 == 0)
					wave3.add(new Rattata());
				else
					wave3.add(new Pidgey());
			else
				if(i % 2 == 0)
					wave3.add(new Weedle());
				else
					wave3.add(new Caterpie());
		}
	}
}