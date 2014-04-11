package towers;

import java.io.File;
import java.util.ArrayList;

import model.Attack;
import model.Clickable;
import model.Player;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Tower.java - Abstract class that will create the base for all towers in the game
 */
public abstract class Tower implements Comparable<Tower>, Clickable
{
	private String name = "";//Name of the tower
	private int height = 1;//How many squares the tower takes up in the y-direction
	private int width = 1;//How many squares the tower takes up in the x-direction
	private int buyPrice = 1;//Price to place the tower
	private int sellPrice = 1;//Money obtained from selling the tower
	private int upgradePrice = 1;//Cost to upgrade the tower
	private Tower upgraded = null;//Reference to the upgraded form of tower
	private ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	private File image;//Image for the tower
	private String type = "Normal";//Tower's type
	
	
	/*
	 *Constructor for a Tower.   
	 */
	public Tower()
	{
		
	}
	
	/*
	 * Returns the name of the tower as a String
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Returns the height of the tower as an int
	 */
	public int getHeight()
	{
		return height;
	}
	
	/*
	 * Returns the width of the tower as an int
	 */
	public int getWidth()
	{
		return width;
	}
	
	/*
	 * Returns the buy price of the tower as an int
	 */
	public int getBuy()
	{
		return buyPrice;
	}
	
	/*
	 * Returns the selling price of the tower as an int
	 */
	public int getSell()
	{
		return sellPrice;
	}
	
	/*
	 * Returns the upgrading price of the tower as an int
	 */
	public int getUpgrade()
	{
		return upgradePrice;
	}
	
	/*
	 * Returns whether or not this tower is unlcocked as a boolean
	 */
	public boolean isUnlocked(Player p)
	{
		boolean unlocked = false;
		if(p.checkUnlocks(name))
		{
			unlocked = true;
		}
		return unlocked;
	}
	
	/*
	 * Returns whether or not the tower can be upgraded as a boolean 
	 */
	public boolean canUpgrade(Player p)
	{
		return p.checkUnlocks(upgraded.getName());
	}
	
	/*
	 * Returns the list of attacks as an ArrayList
	 */
	public ArrayList<Attack> getAttacks()
	{
		return attacks;
	}
	
	/*
	 * Compares this tower to another tower, based on type.
	 * Returns 1 if this Tower has a type advantage
	 * Returns 0 if neither Tower has a type advantage
	 * Returns -1 if the Tower t has a type advantage
	 * 
	 * Paramaters: Tower t - a Tower that this one will be compared to
	 */
	public int compareTo(Tower t)
	{
		return 0;
	}
	
	//Shows the Tower's information ()
	public void showInfo()
	{
		
	}

}
