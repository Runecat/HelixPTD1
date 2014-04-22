package Wave;

import java.util.ArrayList;

import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;

public class WaveOne {
	private ArrayList<Mob> wave1;
	private Mob mob;
	
	public WaveOne(){
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0)
				wave1.add(i, new Rattata());
			else
				wave1.add(i, new Pidgey());
		}

	}
}
