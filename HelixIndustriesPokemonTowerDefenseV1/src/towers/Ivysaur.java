package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Ember;
import attacks.Fireblast;
import attacks.Flamethrower;
import attacks.Vinewhip;
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
 * Ivysaur.java - 
 */

public class Ivysaur extends Tower
{
	public Ivysaur(Tile t, Map m)
	{
		super(t,m);
		super.name = "Ivysaur";
		super.type = Type.GRASS;
		super.attacks.add(new Vinewhip());
		super.upgraded = new Venusaur(t,m);
		super.buyPrice = 250;
		super.upgradePrice = 450;
		super.delay = 4;
		if(t!=null)
			super.setRange(m);;
	}
}