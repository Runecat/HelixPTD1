package Wave;

import java.util.ArrayList;

import Mob.Caterpie;
import Mob.Mob;
import Mob.Pidgey;
import Mob.Rattata;
import Mob.Weedle;

public class WaveThree {
	private ArrayList<Mob> wave3;
	private Mob mob;
		
	public WaveThree(){
		for(int i = 0; i < 25; i++){
			if(i < 15)
				if(i % 2 == 0)
					wave3.add(i, new Rattata());
				else
					wave3.add(i, new Pidgey());
			else
				if(i % 2 == 0)
					wave3.add(i, new Weedle());
				else
					wave3.add(i, new Caterpie());
		}
	}
}