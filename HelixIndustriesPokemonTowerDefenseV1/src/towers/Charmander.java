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

public class Charmander extends Tower
{
	
	public Charmander(Tile t,Map m)
	{
		super(t,m);
		super.name = "Charmander";
		super.type = Type.FIRE;
		super.attacks.add(new Ember());
		super.upgraded = new Charmeleon(t,m);
		super.buyPrice = 100;
		super.upgradePrice = 250;
		super.delay = 2;
		if(t!=null)
			super.setRange(m);
	}

}
