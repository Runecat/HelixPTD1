package model;

import java.io.Serializable;
import java.util.ArrayList;

import towers.Tower;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class Player implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> towersUnlocked;//List of Player's unlocked towers
	private int money = 0;//Amount of money Player has, may move to Game object
	private String name;
	private int health;
	
	
	public Player(String name)
	{
		this.name = name;
		this.health = 150;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	/*
	 * Returns whether or not a tower is unlocked based on its name, as a boolean
	 */
	public boolean checkUnlocks(String towerName)
	{
		boolean hasTower = false;
		for(String tower:towersUnlocked)
		{
			if(towerName.equals(tower))
			{
				hasTower = true;
				break;
			}
		}
		
		return hasTower;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void removeHealth(int remove) {
		this.health -= remove;
	}
	
	public int getHealth() {
		return this.health;
	}

}
