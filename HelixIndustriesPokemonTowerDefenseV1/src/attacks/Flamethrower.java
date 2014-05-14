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
 * Flamethrower.java - Class for the Flamethrower attack
 */

public class Flamethrower extends Attack
{
	public Flamethrower()
	{
		super();
		super.name = "Flamethrower";
		super.damage = 10;
		super.verticalRange = 1;
		super.horizontalRange = 6;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.rangeType = RangeType.HORIZONTAL;
		super.targets = 12;
	}
}

