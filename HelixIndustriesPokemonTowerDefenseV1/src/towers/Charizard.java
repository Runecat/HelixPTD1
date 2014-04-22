package towers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import attacks.Attack;
import attacks.Ember;
import model.Tile;
import model.Type;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Charizard.java - 
 */

public class Charizard extends Tower
{
	private String name;
	private int buyPrice;//Price to place the tower
	private int sellPrice;//Money obtained from selling the tower
	private int upgradePrice;//Cost to upgrade the tower
	private Tower upgraded;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private BufferedImage image;//Image for the tower
	private Type type;//Tower's type
	private Tile location;
	
	public Charizard(ArrayList<Attack> attacks, Tile t, BufferedImage b)
	{
		super(attacks,t, b);
		location = t;
		name = "Charizard";
		type = Type.FIRE;
		this.attacks = attacks;
		upgraded = null;
		image = b;
		
		//REMOVE
		attacks.set(0, new Ember());
	}
}