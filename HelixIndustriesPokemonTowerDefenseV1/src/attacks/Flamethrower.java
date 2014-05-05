package attacks;


import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Tile;
import model.Type;

public class Flamethrower extends Attack
{
	public Flamethrower()
	{
		// TODO Auto-generated constructor stub
		super.damage = 25;
		super.verticalRange = 1;
		super.horizontalRange = 25;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.attackType = AttackType.HORIZONTAL;
		super.image = null;
		super.targets = 1;
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

