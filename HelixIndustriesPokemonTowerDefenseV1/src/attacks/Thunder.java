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
 * Ember.java - Class for the Ember attack
 */

public class Thunder extends Attack
{
	public Thunder()
	{
		super();
		super.name = "Thunder";
		super.damage = 2;
		super.verticalRange = 3;
		super.horizontalRange = 3;
		super.damageType = Type.ELECTRIC;
		super.effect = Effect.paralyze;
		super.rangeType = RangeType.AREA;
		super.image = null;//unimplemented
		super.targets = 1;//unimplemented
	}
}
