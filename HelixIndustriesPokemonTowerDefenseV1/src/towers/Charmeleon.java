package towers;

import java.io.File;
import java.util.ArrayList;

import model.Attack;
import model.Tile;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Charmeleon.java - 
 */

public class Charmeleon extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private File image;//Image for the tower
	private String type;//Tower's type
	private Tile location;
	
	public Charmeleon(ArrayList<Attack> attacks, Tile t)
	{
		super(attacks,t);
		location = t;
		name = "Charmeleon";
		type = "Fire";
		this.attacks = attacks;
		upgraded = new Charizard(attacks, t);
	}
}