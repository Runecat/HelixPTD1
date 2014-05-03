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
	private BufferedImage image;//Image for the tower
	private Type type;//Tower's type
	private Tile location;
	
	public Charmeleon(ArrayList<Attack> attacks, Tile t, BufferedImage b, int height, int width)
	{
		super(attacks,t, b, height, width);
		location = t;
		name = "Charmeleon";
		type = Type.FIRE; 
		this.attacks = attacks;
		upgraded = new Charizard(attacks,t,b, height, width);
		image = b;
		
		//REMOVE
		//attacks.set(0, new Ember());
	}
}