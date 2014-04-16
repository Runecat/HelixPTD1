package attacks;

import java.io.File;
import java.util.ArrayList;

import model.Mob;
import model.Tile;
import model.Type;

public class Ember extends Attack
{

	private int damage = 1;
	private int verticalRange = 1;
	private int horizontalRange = 1;
	private Type damageType = Type.NORMAL;//May make an enum to represent types 
	private int effect = 0;//May make an enum to represent effects
	private File image;
	
	public Ember()
	{
		// TODO Auto-generated constructor stub
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	public Type getType()
	{
		return damageType;
	}
	
	public ArrayList <Mob> calculateAffected(Tile[][] tiles)
	{
		ArrayList<Mob> affectedMobs = new ArrayList<Mob>();
		
		return affectedMobs;
	}
}
