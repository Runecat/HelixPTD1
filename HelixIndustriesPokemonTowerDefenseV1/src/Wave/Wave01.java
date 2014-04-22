package Wave;

import java.util.ArrayList;

import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;

public class Wave01 {
	private Wave wave1 = new Wave();
	private Mob mob;
	
	public Wave01(){
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0)
				wave1.add(new Rattata());
			else
				wave1.add(new Pidgey());
		}

	}
}
