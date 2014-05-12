package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Fireblast;
import attacks.Solarbeam;
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
 * Venusaur.java - 
 */

public class Venusaur extends Tower
{
	public Venusaur(Tile t, Map m)
	{
		super(t,m);
		super.name = "Venusaur";
		super.type = Type.GRASS;
		super.upgraded = null;
		super.attacks.add(new Solarbeam());
		super.upgraded = null;
		super.buyPrice = 450;
		super.upgradePrice = 0;
		super.delay = 16;
		if(t!=null)
			super.setRange(m);
	}
}