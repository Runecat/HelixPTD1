package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import view.ImageLoader;
import attacks.Attack;
import attacks.Ember;
import attacks.Flamethrower;
import attacks.Thunder;
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
 * Charmander.java - 
 */

public class Raichu extends Tower
{
	
	public Raichu(Tile t,Map m)
	{
		super(t,m);
		super.name = "Raichu";
		super.type = Type.ELECTRIC;
		ArrayList<Attack> a = new ArrayList<Attack>();
		super.attacks.add(new Thunder());
		super.upgraded = null;
		super.buyPrice = 350;
		super.upgradePrice = 0;
		super.delay = 1;
		if(t!=null)
			super.setRange(m);
	}

}
