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
 * Charmeleon.java - 
 */

public class Charmeleon extends Tower
{
	
	public Charmeleon(Tile t, Map m)
	{
		super(t,m);
		super.name = "Charmeleon";
		super.type = Type.FIRE;
		ArrayList<Attack> a = new ArrayList<Attack>();
		a.add(new Fireblast());
		super.upgraded = new Charizard(t,m);
		super.attacks.add(new Flamethrower());
		super.buyPrice = 250;
		super.upgradePrice = 450;
	}
}