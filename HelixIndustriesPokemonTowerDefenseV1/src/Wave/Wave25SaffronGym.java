package Wave;

import java.awt.image.BufferedImage;

import Mob.Alakazam;
import Mob.Gastly;
import Mob.Haunter;
import Mob.Kadabra;
import Mob.MrMime;
import Mob.Slowpoke;

public class Wave25SaffronGym extends Wave{

	private int delay = 500;
	private int level = 25;
	
	private BufferedImage slowpoke;
	private BufferedImage mrmime;
	private BufferedImage kadabra;
	private BufferedImage haunter;
	private BufferedImage gastly;
	private BufferedImage alakazam;

	public Wave25SaffronGym(){
		super();
		for(int i = 0; i < 800; i++){
			if(i < 500){
				if(i % 5 == 0)
					add(new Kadabra(kadabra));
				else if(i % 4 == 0)
					add(new Haunter(haunter));
				else if(i % 3 == 0)
					add(new Gastly(gastly));
				else if(i % 2 == 0)
					add(new MrMime(mrmime));
				else
					add(new Slowpoke(slowpoke));
			}
			else{
				if(i % 3 == 0)
					add(new Alakazam(alakazam));
				else if(i % 2 == 0)
					add(new MrMime(mrmime));
				else
					add(new Kadabra(kadabra));
			}
		}
	}
}
