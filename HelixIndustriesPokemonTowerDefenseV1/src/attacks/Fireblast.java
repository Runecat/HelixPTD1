package attacks;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Tile;
import model.Type;

public class Fireblast extends Attack
{
	public Fireblast()
	{
		// TODO Auto-generated constructor stub
		super.damage = 25;
		super.verticalRange = 10;
		super.horizontalRange = 10;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.attackType = AttackType.AREA;
		super.image = null;
		super.targets = 5;
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

