package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Timer;

import maps.Map;

import attacks.Effect;

import towers.Tower;

import Mob.Mob;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class Tile implements Serializable{

	private int x, y;
	private int row;
	private int col;
	private final int TILE_LENGTH = 16;
	
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasMob;
	private boolean canPlaceTower = true;
	private boolean traversed = false;
	private ArrayList<Tile> nextTiles = new ArrayList<Tile>();
	
	private ArrayList<Mob> mobList = new ArrayList<Mob>();
	
	private Object myObject = null;
	private Spawner spawner = null;
	private Player myPlayer;
	private Map currentMap;

	
	public Tile(int x, int y, Map currentMap) {
		this.currentMap = currentMap;
		this.x = x;
		this.y = y;
	}

	// Adds mob to the list of the mobs on the current tile
	public void addMobs(Mob mob) {
		mobList.add(mob);
	}

	public void setPlayer(Player playa) {
		this.myPlayer = playa;
	}
	
	public Player getPlayer() {
		return myPlayer;
	}
	
	public void moveMobs() {
		
		if (nextTiles.size() != 0) {
			if (mobList.size() > 0) {
				for (int i = 0; i < mobList.size(); i++) {
					mobList.get(i).setCurrentTile(this);

					if (mobList.get(i).getHealth() <= 0) {
						myPlayer.addMoney(removeMob(i).getMoney());
					} else {
						if (mobList.size() == 0) {
							return;
						} 
						else 
						{
							if ((mobList.get(i).getHealth() > 0) && (mobList.get(i).getEffect() != Effect.paralyze)) 
							{
								if(mobList.get(i).getEffect() == Effect.burn)
								{
									mobList.get(i).setHealth(mobList.get(i).getHealth() - 2);//set image to fire if health  < 0 
								}
								mobList.get(i).setEffect(Effect.none);
								if (nextTiles.size() > 1) {
									if (!traversed) {
										nextTiles.get(0).addMobs(removeMob(i));
										traversed = true;
									}
									else {
										nextTiles.get(1).addMobs(removeMob(i));
										traversed = false;
									}
								}
								else {
									nextTiles.get(0).addMobs(removeMob(i));
								}
							}
						}
					}

				}
			}
			return;
		}
		else {
			if (mobList.size() != 0) {
				for (int i = 0; i < mobList.size(); i++) {
					mobList.remove(i);
					myPlayer.removeHealth(1);
				}
			}
			else
				return;
		}
	}

	// After time has expired, the mob will be set to the next tile's mob list
	// and removed from the current one
	// If there is no more set path, the mob will only be removed from the
	// tile's mob list
	
	public int getMobSpeed() {
		return mobList.get(0).getMoveSpeed() * 3000;
	}

	public void setLocation(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void setObject(Object obj) {
		this.myObject = obj;
	}

	public Object getObject() {
		return myObject;
	}

	public boolean isOnPath() {
		return isOnPath;
	}

	public void setOnPath(boolean isOnPath) {
		this.isOnPath = isOnPath;
	}

	public boolean hasTower() {
		return myObject instanceof Tower;
	}

	public boolean isEmpty() {
		return !hasMob() && !hasTower();
	}

	public boolean hasMob() {
		return mobList.size() != 0;
	}

	public boolean canPlaceTower() {
		// If it's not on path, it's not any object already,
		// and canPlaceTower hasn't been overwritten to false already,
		// returns true
		canPlaceTower = (isOnPath == false && myObject == null && !isSpawner() && canPlaceTower);
		return canPlaceTower;
	}	
	
	// Pretty much an override method, but not really. Well kinda
	public void setCanPlaceTower(boolean value) {
		this.canPlaceTower = value;
	}

	public void setNextPathTile(Tile next) {
		this.nextTiles.add(next);
		next.setOnPath(true);
	}

	public ArrayList<Tile> getNextTile() {
		return nextTiles;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return col;
	}

	public Mob removeMob(int i) {
		return mobList.remove(i);
	}
	
	

	public ArrayList<Mob> getMobs() {
		return mobList;
	}

	public void setSpawner(Spawner spawner) {
		this.spawner = spawner;
		this.setOnPath(true);
	}

	public Spawner getSpawnerTile() {
		return spawner;
	}
	
	public boolean isSpawner() {
		return spawner != null;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int checkDeaths() {
		int cash = 0;
		for (int i = 0; i < mobList.size(); i++) {
			if (mobList.get(i).getHealth() < 1){
				cash += mobList.get(i).getMoney();
				mobList.remove(i);
			}
			
		}
		return cash;
	}

}
