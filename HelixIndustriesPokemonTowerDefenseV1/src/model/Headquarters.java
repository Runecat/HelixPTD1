package model;

import java.io.File;

import Mob.Mob;

import towers.Tower;

public class Headquarters 
{
	public String name = "";
	public static int health = 1;
	public int PokeDollar = 500;
	public File image = null;
	private Map track = null;
	public int spawnX = 1;
	public int spawnY = 1;
	public Mob GaryFuckingOak;
	public Tower Helix;
	
	public Headquarters(){
		name = getName();
		health = setHealth();
	}
	public void loseLife(){
		health--;
	}
	
	public void GETDATMONAY(){
		PokeDollar += GaryFuckingOak.getMoney();
	}
	
	public void BuyTower(){
		PokeDollar -= Helix.getBuy();
	}
	
	public void sellTower(){
		PokeDollar += Helix.getSell();
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
