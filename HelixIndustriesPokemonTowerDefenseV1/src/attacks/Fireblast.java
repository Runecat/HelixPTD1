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

public class Fireblast extends Attack
{
	public Fireblast()
	{
		super();
		super.name = "Fire Blast";
		super.damage = 15;
		super.verticalRange = 3;
		super.horizontalRange = 3;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.rangeType = RangeType.AREA;
		super.targets = 24;
	}
}

