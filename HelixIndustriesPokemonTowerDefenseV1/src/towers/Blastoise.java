package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Fireblast;
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
 * Blastoise.java - 
 */

public class Blastoise extends Tower
{
	public Blastoise(Tile t, Map m)
	{
		super(t,m);
		super.name = "Blastoise";
		super.type = Type.WATER;
		super.upgraded = null;
		super.attacks.add(new Fireblast());
		super.buyPrice = 999999;
		super.upgradePrice = 0;
		if(t!=null)
			super.setRange(m);
	}
}
