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

public class Thundershock extends Attack
{
	public Thundershock()
	{
		super();
		super.name = "Thundershock";
		super.damage = 5;
		super.verticalRange = 2;
		super.horizontalRange = 2;
		super.damageType = Type.ELECTRIC;
		super.effect = Effect.paralyze;
		super.rangeType = RangeType.NORMAL;
		super.image = null;//unimplemented
		super.targets = 1;//unimplemented
	}
}
