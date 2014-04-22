package attacks;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Effect;
import model.Tile;
import model.Type;

public class Ember extends Attack
{

	private int damage;
	private int verticalRange;
	private int horizontalRange;
	private Type damageType;//May make an enum to represent types 
	private Effect effect;//May make an enum to represent effects
	private File image;
	
	public Ember()
	{
		// TODO Auto-generated constructor stub
		damage = 3;
		verticalRange = 0;
		horizontalRange = 5;
		damageType = Type.FIRE;
		effect = null;
		image = null;
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
