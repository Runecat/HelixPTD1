package attacks;

import java.io.File;
import java.util.ArrayList;

import model.Mob;
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
	private int damage = 1;
	private int verticalRange = 1;
	private int horizontalRange = 1;
	private Type damageType = Type.NORMAL;//May make an enum to represent types 
	private int effect = 0;//May make an enum to represent effects
	private File image;
	
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
	
	public abstract ArrayList<Mob> calculateAffected(Tile[][] t);
}
