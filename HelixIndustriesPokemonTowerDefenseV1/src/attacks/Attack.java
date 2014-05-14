package attacks;

import java.io.File;
import java.io.Serializable;

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

public abstract class Attack implements Serializable
{
	protected String name;
	protected int damage;//Damage attack deals to each target
	protected int verticalRange;//Attack's vertical range
	protected int horizontalRange;//Attack's horitzontal range
	protected Type damageType;//Elemental Type of Attack 
	protected Effect effect;//Type of Effect Attack has
	protected RangeType rangeType;//Type of Attack in terms of Range
	protected int targets;//Number of Targets the attack can hit - currently unused
	protected File image;//Image for attack - currently unused
	
	public Attack()
	{
		
	}
	
	//Returns damage that attack deals to an enemy
	public int getDamage()
	{
		return damage;
	}
	
	//returns elemental type of attack
	public Type getType()
	{
		return damageType;
	}
	
	public Effect getEffect(){
		return effect;
	}
	
	//returns vertical range of attack
	public int getVerticalRange()
	{
		return verticalRange;
	}
	
	//Returns horizontal range of attack
	public int getHorizontalRange()
	{
		return horizontalRange;
	}
	
	//Returns attack type for range calculation
	public RangeType getRangeType()
	{
		return rangeType;
	}
	
	//Returns max number of targets attack can hit
	public int getTargets()
	{
		return targets;
	}
	
	//Returns attack's name
	public String getName()
	{
		return name;
	}
}
