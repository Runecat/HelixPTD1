package towers;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import attacks.Attack;
import maps.Map;
import model.Clickable;
import model.Player;
import model.Tile;
import model.Type;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * Helix Industries:
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Tower.java - Abstract class that will create the base for all towers in the game
 */
public abstract class Tower implements Clickable
{
	protected String name = "";//Name of the tower
	protected int height;//How many squares the tower takes up in the y-direction
	protected int width;//How many squares the tower takes up in the x-direction
	protected int buyPrice;//Price to place the tower
	protected int sellPrice;//Money obtained from selling the tower
	protected int upgradePrice;//Cost to upgrade the tower
	protected Tower upgraded;//Reference to the upgraded form of tower
	protected ArrayList<Attack> attacks= new ArrayList<Attack>();//List of the tower's attacks
	protected BufferedImage image;//Image for the tower
	protected Type type;//Tower type
	protected Tile location;
	
	
	/*
	 *Constructor for a Tower.   
	 */
	public Tower(ArrayList<Attack> a, Tile t, BufferedImage b, int height, int width)
	{
		attacks = a;
		location = t;
		image = b;
		this.height = height;
		this.width = width;
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
	 * Deals damage to a given Mob based on Tower, Attack, and Mob types
	 */
	public void dealDamage(Attack a, Mob m)
	{
		System.out.println("Dealing damage, sir!");
		int damageDealt = 0;
		boolean modifier = false;
		
		if(type == a.getType())
		{
			modifier = true;
		}
		System.out.println("Damage: " + a.getDamage());
		//System.out.println(type);
		//System.out.println((Type.getEffectiveness(type,m.getMobType());
		damageDealt = a.getDamage();
				//(int) Math.ceil((type.getEffectiveness(m.getMobType()))*a.getDamage());
				
		if(modifier)
		{
			damageDealt++;
		}
		
		m.setHealth(m.getHealth() - damageDealt);
	}
	
	public void attackEnemy(Attack a, ArrayList<Mob> inRange)
	{
		for(Mob m: inRange)
		{
			dealDamage(a,m);
		}
	}
	
	public int getRow()
	{
		return location.getRow();
	}
	
	public int getColumn()
	{
		return location.getColumn();
	}
	
	
	
	//Shows the Tower's information ()
	public void showInfo()
	{
		
	}
	
	public void drawTower(Graphics2D g)
	{
		//draw image
	}
	
	public void setRange()
	{
	
	}
	
	public void attack(Map m)
	{
		System.out.println("Commencing attack, sir!");
		ArrayList<Mob> mobs = new ArrayList<Mob>();
		ArrayList<Tile> tilesInRange = new ArrayList<Tile>();
		Tile[][] grid = m.getGrid();
		//grab which tiles are in range
		//for those tiles in range, find mobs on them
		//have tower attack those mobs if permitted to
		int xMin = location.getX() - attacks.get(0).getHorizontalRange();
		int xMax = location.getX() + attacks.get(0).getHorizontalRange();
		int yMin = location.getY() - attacks.get(0).getVerticalRange();
		int yMax = location.getY() + attacks.get(0).getVerticalRange();
		System.out.println("Row: " + location.getX());
		System.out.println("Column: " + location.getY());
		int x;
		int y;
		
		if(xMin <0)
		{
			xMin = 0;
		}
		
		if(yMin < 0)
		{
			yMin = 0;
		}
		
		if(xMax > width)
		{
			xMax = width;
		}
		
		if(yMax > height)
		{
			yMax = height;
		}
		//possibly need to add -1 to the max....
		//System.out.println(xMin + " " + xMax + " " + yMin + " " + yMax);
		for(x = xMin;x<xMax;x++)
		{
			for(y = yMin;y<yMax;y++)
			{
				//System.out.println(grid[x][y].hasMob());
				if(grid[x][y].hasMob())
				{
					tilesInRange.add(grid[x][y]);
				}
			}
		}
		
		if (tilesInRange.size()>0){
			mobs.add(tilesInRange.get(0).getMobs().get(0));//for now, just attack first mob in first tile
			attackEnemy(attacks.get(0), mobs);
		}
		//depending on type, add from all possible mobs the only mobs that will attack
		 
		 
	}
	
	//get file from here or actually handle drawing from tower? 

}
