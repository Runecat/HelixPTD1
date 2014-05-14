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

public class Ember extends Attack
{
	public Ember()
	{
		super();
		super.name = "Ember";
		super.damage = 5;
		super.verticalRange = 2;
		super.horizontalRange = 2;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.rangeType = RangeType.NORMAL;
		super.targets = 1;
	}
}
