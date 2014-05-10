package model;

import java.io.Serializable;
import java.util.ArrayList;

import towers.Tower;

public class Player implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int experience = 0;//Used to choose upgrades in the main menu
	private int score = 0;//Score, may move to Game object, calculate experience based on score
	private int defeatedMobs = 0;//Number of mobs killed, for unlocks/achievements
	private ArrayList<String> mapsCleared;//List of maps Player has cleared
	private ArrayList<String> towersUnlocked;//List of Player's unlocked towers
	private ArrayList<Tower> towers;//List of all a Player's Towers, may move to Game object
	private int money = 0;//Amount of money Player has, may move to Game object
	private String name;
	
	
	public Player(String name)
	{
		this.name = name;
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

}
