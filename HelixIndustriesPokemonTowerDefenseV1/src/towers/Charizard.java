package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Ember;
import attacks.Fireblast;
import attacks.Flamethrower;
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
 * Charizard.java - 
 */

public class Charizard extends Tower
{
	
	public Charizard(Tile t, Map m)
	{
		super(t,m);
		super.name = "Charizard";
		super.type = Type.FIRE;
		super.upgraded = null;
		super.attacks.add(new Fireblast());
		super.buyPrice = 450;
		super.upgradePrice = 0;
		super.delay = 8;
		if(t!=null)
			super.setRange(m);
	}
}