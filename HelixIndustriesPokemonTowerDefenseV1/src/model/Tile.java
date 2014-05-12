package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import attacks.Effect;

import towers.Tower;

import Mob.Mob;

public class Tile {

	private int x, y;
	private int row;
	private int col;
	private final int TILE_LENGTH = 16;
	
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasMob;
	private Tile next;
	
	private ArrayList<Mob> mobList = new ArrayList<Mob>();
	
	private Object myObject = null;
	private Spawner spawner = null;
	private Player myPlayer;

	public Tile(int x, int y) {
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

		if (next != null) {
			if (mobList.size() > 0) {
				for (int i = 0; i < mobList.size(); i++) {
					mobList.get(i).setCurrentTile(next);

					if (mobList.get(i).getHealth() <= 0) {
						System.out.println("Keeled one!");
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
								Mob temp = removeMob(i);
								next.addMobs(temp);
							}
						}
					}

				}
			}
			return;
		} else {
			if (mobList.size() != 0)
				removeMob(0);
			else
				return;
		}
	}

	// After time has expired, the mob will be set to the next tile's mob list
	// and removed from the current one
	// If there is no more set path, the mob will only be removed from the
	// tile's mob list

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

	// public void setHasTower(boolean hasTower) {
	// this.hasTower = hasTower;
	// }

	public boolean isEmpty() {
		return !hasMob() && !hasTower();
	}

	// public void setIsEmpty(boolean isEmpty) {
	// this.isEmpty = isEmpty;
	// }

	public boolean hasMob() {
		return mobList.size() != 0;
	}

	// public void setHasMob(boolean hasMob) {
	// this.hasMob = hasMob;
	// }

	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// Currently set so that a tower can be placed on either land or water *
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	public boolean canPlaceTower() {
		return  (isOnPath == false && myObject == null && !isSpawner());
	}	

	public void setNextPathTile(Tile next) {
		this.next = next;
		next.setOnPath(true);
		
	}

	public Tile getNextTile() {
		return next;
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
		this.isOnPath = true;
		this.spawner = spawner;
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

	public Tile next() {
		return next;
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
