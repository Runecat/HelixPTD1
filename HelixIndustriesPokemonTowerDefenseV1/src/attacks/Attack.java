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
 * Attack.java - Abstract class that will create the base for all attacks in the game
 */

public abstract class Attack
{
	protected int damage;
	protected int verticalRange;
	protected int horizontalRange;
	protected Type damageType;//May make an enum to represent types 
	protected Effect effect;//May make an enum to represent effects
	protected AttackType attackType;
	protected int targets;
	protected File image;
	
	public Attack()
	{
		
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	public Type getType()
	{
		return damageType;
	}
	
	public int getVerticalRange()
	{
		return 0;
	}
	
	public int getHorizontalRange()
	{
		return 0;
	}
	
	public AttackType getAttackType()
	{
		return attackType;
	}
	
	//public abstract ArrayList <Mob> calculateAffected(Mob[] mobs);
}
