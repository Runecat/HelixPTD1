package model;

import java.io.File;

public class Mob implements Clickable
{
	//May need location variables
	private String name = "Bob the Mob";
	private int health = 1;
	private int baseDamage = 1;
	private int moveSpeed = 1;
	private int height = 1;
	private int width =1;
	private int mobType = 0;//Might make into enum
	private File image;

	public Mob()
	{
		
	}
	
	public void moveMob()
	{
		//might move based on location variables
	}
	
	//Shows the Mob's information ()
	public void showInfo()
	{
		
	}
}
