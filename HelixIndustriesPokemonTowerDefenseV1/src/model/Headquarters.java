package model;

import java.io.File;

import maps.Map;

import Mob.Mob;

import towers.Tower;

public class Headquarters 
{
	public String name = "";
	public static int health = 1;
	public int PokeDollars = 500;
	public long Score = 0;
	public File image = null;
	private Map track = null;
	public int spawnX = 1;
	public int spawnY = 1;
	public Mob Mobjects;
	public Tower Helix;
	
	public Headquarters(){
		name = getName();
		health = setHealth();
	}
	public void loseLife(){
		health--;
	}
	
	public void addScore(){
		Score += Mobjects.getMoney() * 10;
	}
	
	public void GETDATMONAY(){
		PokeDollars += Mobjects.getMoney();
	}
	
	public void BuyTower(){
		PokeDollars -= Helix.getBuy();
	}
	
	public void sellTower(){
		PokeDollars += Helix.getSell();
	}
	
	public int setHealth(){
		/*if(difficulty.equals("easy")
		 * 		health = 200;
		 * 
		 * else if(difficulty.equals("medium")
		 * 		health = 150;
		 * 
		 * else if(difficulty.equals("NIGHTMARE")
		 * 		health = 1;
		 * 
		 * else
		 * 		health = 100;
		*/
		health = 200;
		return health;
	}
	
	
	public void setHQLocation(){
		track.getTile(spawnX, spawnY).setObject(new Headquarters());
	}
	
	public void gameOver(){
		//if(health == 0)
		//	gameOver();
	}
	public Map getTrack() {
		return track;
	}
	public void setTrack(Map track) {
		this.track = track;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
