package Wave;

import java.awt.image.BufferedImage;

import Mob.Cloyster;
import Mob.Dewgong;
import Mob.Jynx;
import Mob.Lapras;
import Mob.Slowbro;

public class Wave46EliteLorelei extends Wave{

	private int delay = 444;
	private int level = 46;
	
	private BufferedImage lapras;
	private BufferedImage cloyster;
	private BufferedImage dewgong;
	private BufferedImage slowbro;
	private BufferedImage jynx;


	public Wave46EliteLorelei(){
		super();
		for(int i = 0; i < 4000; i++){
			if(i % 5 == 0)
				add(new Jynx(jynx));
			else if(i % 4 == 0)
				add(new Lapras(lapras));
			else if(i % 3 == 0)
				add(new Cloyster(cloyster));
			else if(i % 2 == 0)
				add(new Slowbro(slowbro));
			else
				add(new Dewgong(dewgong));
		}
	}
}
