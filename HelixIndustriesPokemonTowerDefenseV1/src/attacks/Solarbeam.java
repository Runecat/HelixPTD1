package attacks;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Tile;
import model.Type;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Fireblast.java - Class for the Fireblast attack
 */

public class Solarbeam extends Attack
{
	public Solarbeam()
	{
		super();
		super.name = "Solar Beam";
		super.damage = 20;
		super.verticalRange = 2;
		super.horizontalRange = 2;
		super.damageType = Type.GRASS;
		super.effect = Effect.none;
		super.rangeType = RangeType.TILE;
		super.targets = 100;
	}
}

