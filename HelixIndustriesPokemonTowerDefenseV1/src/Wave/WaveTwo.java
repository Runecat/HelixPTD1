package Wave;

import java.util.ArrayList;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;

public class WaveTwo {
	private ArrayList<Mob> wave2;
	private Mob mob;
		
	public WaveTwo(){
		for(int i = 0; i < 15; i++){
			if(i % 2 == 0)
				wave2.add(i, new Rattata());
			else
				wave2.add(i, new Pidgey());
		}
	}
}

