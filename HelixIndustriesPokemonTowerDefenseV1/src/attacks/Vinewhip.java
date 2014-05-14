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
 * Vinewhip.java - Class for the Vinewhip attack
 */

public class Vinewhip extends Attack
{
	public Vinewhip()
	{
		super();
		super.name = "Vine Whip";
		super.damage = 12;
		super.verticalRange = 1;
		super.horizontalRange = 6;
		super.damageType = Type.GRASS;
		super.effect = Effect.none;
		super.rangeType = RangeType.HORIZONTAL;
		super.targets = 12;
	}
}

