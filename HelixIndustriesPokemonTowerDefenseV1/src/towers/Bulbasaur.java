package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Ember;
import attacks.Flamethrower;
import attacks.Leechseed;
import maps.Map;
import model.Tile;
import model.Type;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Bulbasaur.java - 
 */

public class Bulbasaur extends Tower
{
	public Bulbasaur(Tile t,Map m)
	{
		super(t,m);
		super.name = "Bulbasaur";
		super.type = Type.GRASS;
		super.attacks.add(new Leechseed());
		super.upgraded = new Ivysaur(t,m);
		super.buyPrice = 100;
		super.upgradePrice = 250;
		super.delay = 1;
		if(t!=null)
			super.setRange(m);
	}
}
