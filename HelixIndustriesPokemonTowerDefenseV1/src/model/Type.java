package model;

import java.io.Serializable;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public enum Type implements Serializable{
	BUG, DRAGON, ELECTRIC, FIGHTING, FIRE, FLYING, 
	GHOST, GRASS, GROUND, ICE, NORMAL, POISON,
	PSYCHIC, ROCK, WATER;
	
	// This will be the typical method used to find effectiveness
	public double getEffectiveness(Type defend){
		return getEffectiveness(this, defend);
	}
	
	public double getEffectiveness(Type attack, Type defend) {
		
		double superEffective = 2.0;
		double notVeryEffective = 0.5;
		double noEffect = 0.0;
		
		if (attack == BUG) {
			if (defend == POISON || defend == GRASS || defend == PSYCHIC)
				return superEffective;
			else if (defend == FIGHTING || defend == FLYING || defend == GHOST || defend == FIRE)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == DRAGON) {
			if (defend == DRAGON) 
				return superEffective;
			else
				return 1;
		}
		
		else if (attack == ELECTRIC) {
			if (defend == FLYING || defend == WATER) 
				return superEffective;
			else if (defend == GRASS || defend == ELECTRIC || defend == DRAGON) 
				return notVeryEffective;
			else if (defend == GROUND)
				return noEffect;
			else
				return 1;
		}
		
		else if (attack == FIGHTING) {
			if (defend == NORMAL || defend == ROCK || defend == ICE)
				return superEffective;
			else if (defend == FLYING || defend == POISON || defend == BUG || defend == PSYCHIC)
				return notVeryEffective;
			else if (defend == GHOST) 
				return noEffect;
			else
				return 1;
		}
		
		else if (attack == FIRE) {
			if (defend == BUG || defend == GRASS || defend == ICE)
				return superEffective;
			else if (defend == ROCK || defend == FIRE || defend == WATER || defend == DRAGON)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == FLYING) {
			if (defend == FIGHTING || defend == BUG || defend == GRASS)
				return superEffective;
			else if (defend == ROCK || defend == ELECTRIC)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == GHOST) {
			if (defend == GHOST)
				return superEffective;
			else if (defend == NORMAL || defend == PSYCHIC)
				return noEffect;
			else return 1;
		}
		
		else if (attack == GRASS) {
			if (defend == GROUND || defend == ROCK || defend == WATER)
				return superEffective;
			else if (defend == FLYING || defend == POISON || defend == BUG || defend == FIRE || defend == GRASS || defend == DRAGON)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == GROUND) {
			if (defend == POISON || defend == ROCK || defend == FIRE || defend == ELECTRIC)
				return superEffective;
			else if (defend == BUG || defend == GRASS)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == ICE) {
			if (defend == FLYING || defend == GROUND || defend == GRASS || defend == DRAGON)
				return superEffective;
			else if (defend == WATER || defend == ICE)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == NORMAL) {
			if (defend == ROCK)
				return notVeryEffective;
			else if (defend == GHOST)
				return noEffect;
			else
				return 1;
		}
		
		else if (attack == POISON) {
			if (defend == BUG || defend == GRASS)
				return superEffective;
			else if (defend == POISON || defend == GROUND || defend == ROCK || defend == GHOST)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == PSYCHIC) {
			if (defend == FIGHTING || defend == POISON) 
				return superEffective;
			else if (defend == PSYCHIC)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == ROCK) {
			if (defend == FLYING || defend == BUG || defend == FIRE || defend == ICE)
				return superEffective;
			else if (defend == FIGHTING || defend == GROUND)
				return notVeryEffective;
			else
				return 1;
		}
		
		else if (attack == WATER) {
			if (defend == GROUND || defend == ROCK || defend == FIRE)
				return superEffective;
			else if (defend == WATER || defend == GRASS || defend == DRAGON)
				return notVeryEffective;
			else
				return 1;
		}
		
		else
			return noEffect;
		
	}
}
