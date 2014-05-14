package towers;

import java.io.File;
import java.util.ArrayList;

import Mob.Mob;
import attacks.Attack;
import attacks.RangeType;
import maps.Map;
import model.Clickable;
import model.Player;
import model.Tile;
import model.Type;
import attacks.Effect;

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
	protected Type type;//Tower type
	protected Tile location;
	protected int delay;
	private int currentDelay = -1;
	ArrayList<Tile> tilesInRange; 
	
	protected BufferedImage image;//Image for the tower
	
	/*
	 *Constructor for a Tower.   
	 */
	public Tower(Tile t, Map m)
	{
		location = t;
	}
	/*
	 * Checks the all tiles within the Tower's Attack's range and adds them to a list
	 */
	public void setRange(Map m)
	{
		System.out.println("Setting Range: location"+location.getX()+','+location.getY());
		tilesInRange = new ArrayList<Tile>();
		Tile[][] grid = m.getGrid();
		//grab which tiles are in range
		int xMin = location.getX() - attacks.get(0).getHorizontalRange();
		int xMax = location.getX() + attacks.get(0).getHorizontalRange();
		int yMin = location.getY() - attacks.get(0).getVerticalRange();
		int yMax = location.getY() + attacks.get(0).getVerticalRange();
		int x;
		int y;
//		System.out.println("x: " + location.getX());
//		System.out.println("x: " + location.getY());
//		System.out.println("Horizontal Range: " + attacks.get(0).getHorizontalRange());
//		System.out.println("Vertical Range: " + attacks.get(0).getVerticalRange());
		
		//Calculates range boundaries, based on attack range and map boundaries
		if(xMin <0)
		{
			//System.out.println("xmin before: " + xMin);
			xMin = 0;
			//System.out.println("xmin after: " + xMin);
		}
		
		if(yMin < 0)
		{
			//System.out.println("ymin before: " + yMin);
			yMin = 0;
			//System.out.println("ymin after: " + yMin);
		}
		
		if(xMax > m.getWidth())
		{
			System.out.println("xmax before: " + xMax);
			xMax = m.getWidth();
			System.out.println("xmax after: " + xMax);
		}
		
		if(yMax > m.getHeight())
		{
			//System.out.println("ymax before: " + yMax);
			yMax = m.getHeight();
			//System.out.println("ymax after: " + yMax);
		}
		//Adds tiles in range to the range array
		for(x = xMin;x<=xMax;x++)
		{
			for(y = yMin;y<=yMax;y++)
			{
					tilesInRange.add(grid[x][y]);
					System.out.println("Tile added: " + x + ',' + y);
			}
		}
		
		//System.out.println("Tiles in range(size): " + tilesInRange.size());
		
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
	
	
	public void setImage(BufferedImage b)
	{
		this.image = b;
	}
	
	public void setUpgrade(Tower t)
	{
		upgraded = t;
	}
	
	public void attack()//Map m
	{
		ArrayList<Mob> mobs = new ArrayList<Mob>();	
		//calculate which mobs to grab for each type
		 
		if (attacks.get(0).getRangeType() == RangeType.NORMAL)
		{	
			for(Tile t: tilesInRange)
			{	
				System.out.print(t.hasMob());
				if(t.hasMob() && (mobs.size()<attacks.get(0).getTargets()))
				{
					for(int i = 0;i<t.getMobs().size();i++)
					{
						if(t.getMobs().get(i).getHealth()>0)
						{
							mobs.add(t.getMobs().get(i));
							break;
						}	
					}
					//currently adds one mob per tile in range
					break;
				}
			}
		}
		else if(attacks.get(0).getRangeType() == RangeType.AREA)
		{
			for(Tile t: tilesInRange)
			{
				if(t.hasMob() && (mobs.size()<attacks.get(0).getTargets()))
				{

					for(int i = 0;i<t.getMobs().size();i++)
					{
						if(t.getMobs().get(i).getHealth()>0)
						{
							mobs.add(t.getMobs().get(i));
							break;
						}
					}
					//currently adds one mob per tile in range
					break;
				}
			}
		}
		
		else if(attacks.get(0).getRangeType() == RangeType.TILE)
		{
			for(Tile t: tilesInRange)
			{	if(t.hasMob() && (mobs.size()<attacks.get(0).getTargets()))
				{
					for(Mob m:t.getMobs())
					{
						if(m.getHealth()>0)
							mobs.add(m);
					}
					//adds all mobs in every tile in range
					break;//might need to change placement
				}
			}
		}
		
		else if (tilesInRange.size()>0 && (attacks.get(0).getRangeType() == RangeType.HORIZONTAL))
		{	
					for(Tile t: tilesInRange)
					{
						if(t.hasMob() && (mobs.size()<attacks.get(0).getTargets()))
						{

							for(int i = 0;i<t.getMobs().size();i++)
							{
								if(t.getMobs().get(i).getHealth()>0)
								{
									mobs.add(t.getMobs().get(i));
									break;
								}
							}
							//currently adds one mob per tile in range
							break;
						}
					}
		}
		System.out.println("MOBS: "+ mobs.size());
		if(mobs.size() > 0 && attackDelay(currentDelay))
			attackEnemy(attacks.get(0), mobs);
			
	}
	/*
	 * Deals damage to a given Mob based on Tower, Attack, and Mob types
	 */
	public void dealDamage(Attack a, Mob m)
	{
		//System.out.println("Dealing damage, sir!");
		int damageDealt = 0;
		boolean modifier = false;
		//Type t = new Type();
		
		if(type == a.getType())
		{
			modifier = true;
		}
		
		//damageDealt = a.getDamage();
		damageDealt = (int) Math.ceil((type.getEffectiveness(m.getMobType()))*a.getDamage());//Calculate effectiveness, may need to change
		//System.out.println("Damage: " + damageDealt);
				
		if(a.getType() == Type.FIRE)
			m.setFire();
		else if(a.getType()==Type.GRASS)
			m.setGrass();
		else if(a.getType()==Type.ELECTRIC)
			m.setElectric();
		if(modifier)
		{
			damageDealt++;
		}
		
		m.setHealth(m.getHealth() - damageDealt);
		
		if(m.getHealth() > 0){
			double random = Math.round(Math.random() * 100);
			switch(attacks.get(0).getEffect()){
			
			case burn:
				if(random <= 1){
					m.setEffect(Effect.burn);
					System.out.println("SWEET JESUS IM ON FIRE");
				}
				break;
				
			case paralyze:
				if(random <= 2){
					m.setEffect(Effect.paralyze);
					System.out.println("VEGETABLE STATUS");
				}
				break;
			default:break;
			}
		}
	}
	
	public void attackEnemy(Attack a, ArrayList<Mob> inRange)
	{
		//System.out.println("AttackEnemy() called");
		for(Mob m: inRange)
		{
			dealDamage(a,m);
		}
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public void upgradeTower()
	{
		location.setObject((Object)upgraded);
	}
	
	public Tower getUpgraded()
	{
		return upgraded;
	}
	
	private void setDelay(int delay)
	{
		currentDelay = delay;
	}
	
	private boolean attackDelay(int delay)
	{
		if(currentDelay == -1)
			currentDelay=0;
		if(currentDelay==delay)
		{
			currentDelay = 0;
			return true;
		}
		else
		{
			currentDelay+=1;
			return false;
		}
	}
	
	public ArrayList<Tile> getRange()
	{
		return tilesInRange;
	}
		
}
