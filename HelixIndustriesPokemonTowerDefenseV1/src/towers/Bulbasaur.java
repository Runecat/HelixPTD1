package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Ember;
import attacks.Flamethrower;
import maps.Map;
import model.Clickable;
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
		ArrayList<Attack> a = new ArrayList<Attack>();
		a.add(new Flamethrower());
		super.upgraded = new Ivysaur(t,m);
		super.attacks.add(new Ember());
		super.buyPrice = 100;
		super.upgradePrice = 250;
		if(t!=null)
			super.setRange(m);
	}
}
