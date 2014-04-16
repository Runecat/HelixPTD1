package towers;

import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import model.Tile;
import model.Type;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Venusaur.java - 
 */

public class Venusaur extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private File image;//Image for the tower
	private Type type;//Tower's type
	private Tile location;//Tower's location on the map
	
	
	public Venusaur(ArrayList<Attack> attacks, Tile t)
	{
		super(attacks,t);
		location = t;
		name = "Venusaur";
		type = Type.GRASS;
		this.attacks = attacks;
		upgraded = null;
	}
}