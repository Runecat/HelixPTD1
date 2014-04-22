package towers;

import java.awt.image.BufferedImage;
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
 * Squirtle.java - 
 */

public class Squirtle extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private BufferedImage image;//Image for the tower
	private Type type;//Tower's type
	private Tile location;//Tower's location on the map
	
	
	public Squirtle(ArrayList<Attack> attacks, Tile t, BufferedImage b)
	{
		super(attacks,t, b);
		location = t;
		name = "Squirtle";
		type = Type.WATER;
		this.attacks = attacks;
		upgraded = new Wartortle(attacks,t, b);
	}

}
