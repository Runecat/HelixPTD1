package model;

import java.io.File;
import java.util.ArrayList;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Tower.java - Abstract class that will create the base for all towers in the game
 * 
 */
public abstract class Tower implements Comparable<Tower>
{
	private String name = "";
	private int height = 1;
	private int width = 1;
	private int buyPrice = 1;
	private int sellPrice = 1;
	private int upgradePrice = 1;
	private Tower upgraded;
	private boolean unlocked = false;
	private ArrayList<Attack> attacks= new ArrayList<Attack>();
	private File image;
	private String type = "Normal";
	
	
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
	public boolean isUnlocked()
	{
		return unlocked;
	}
	
	/*
	 * Returns whether or not the tower can be upgraded as a boolean 
	 */
	public boolean canUpgrade()
	{
		return upgraded.isUnlocked();
	}
	
	/*
	 * Returns the list of attacks as an ArrayList
	 */
	public ArrayList<Attack>()
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

}
