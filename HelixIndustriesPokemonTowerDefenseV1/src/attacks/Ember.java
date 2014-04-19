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
	private int horizontalRange = 10;
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
	
	public int getVerticalRange()
	{
		return verticalRange;
	}
	
	public int getHorizontalRange()
	{
		return horizontalRange;
	}
	
	/*public ArrayList <Mob> calculateAffected(Mob[] mobs)
	{
		ArrayList<Mob> affectedMobs = new ArrayList<Mob>();
		
		return affectedMobs;
	}*/
}
