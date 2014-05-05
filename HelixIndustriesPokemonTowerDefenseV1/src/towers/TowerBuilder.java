package towers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import maps.Map;
import model.Tile;
import attacks.Attack;

public class TowerBuilder 
{
	Tower[] towers = new Tower[9];
	//handle sprite cutting
	public TowerBuilder()
	{
			
	}
	//take specific tower and do shit with it
	
	public Tower buildTower(TowerID i, Tile t, Map m)//needs map, tile that is it....
	//public Charmander(ArrayList<Attack> attacks, Tile t, BufferedImage b, Map m)
	{
		Tower tower;
		switch(i)
		{
			case BULBASAUR: tower = new Bulbasaur(t,m);
				break;
			case IVYSAUR: tower = new Ivysaur(t,m);
				break;
			case VENUSAUR: tower = new Venusaur(t,m);
				break;
			case CHARMANDER: tower = new Charmander(t,m);
				break;
			case CHARMELEON: tower = new Charmeleon(t,m);
				break;
			case CHARIZARD: tower = new Charizard(t,m);
				break;
			case SQUIRTLE: tower = new Squirtle(t,m);
				break;
			case WARTORTLE: tower = new Wartortle(t,m);
				break;
			case BLASTOISE: tower = new Blastoise(t,m);
				break;
			//case PIKACHU: tower = new Pikachu(t,m);
			//	break;
			//case RAICHU: tower = new Raichu(t,m);
			//	break;
			default: tower = null;
				break;
		}
		return tower;
	}

}
