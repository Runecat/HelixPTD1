package attacks;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import model.Tile;
import model.Type;

public class Ember extends Attack
{
	public Ember()
	{
		// TODO Auto-generated constructor stub
		super();
		super.damage = 25;
		super.verticalRange = 5;
		super.horizontalRange = 5;
		super.damageType = Type.FIRE;
		super.effect = Effect.burn;
		super.attackType = AttackType.NORMAL;
		super.image = null;
		super.targets = 1;
	}
	/*
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
