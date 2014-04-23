package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

import towers.Tower;

import Mob.Mob;

public class Tile {
	
	int height, width;
	private boolean isOnPath;
	private boolean hasTower;
	private boolean isEmpty;
	private boolean hasMob;
	private boolean isWater;
	private boolean isLand;
	private Directions direction = null;
	private Mob mob;
	private ArrayList<Mob> mobList = new ArrayList<Mob>();
	private int row;
	private int col;
	private Object myObject = null;
	private Tile next;
	private Spawner spawner = null;
	private MoveMobListener moveMob;
	
	public Tile(int width, int height) {
		this.width = width;
		this.height = height;
		moveMob = new MoveMobListener();
	}
	
	// Adds mob to the list of the mobs on the current tile
	// Calls moveMobs()
	public void addMobs(Mob mob) {
		mobList.add(mob);
		moveMobs();
	}
	
	// Makes a timer based on the current mob's movement speed (getMobSpeed())
	// Starts the timer and calls MoveMobListener
	public void moveMobs() {
		Timer t = new Timer(getMobSpeed(), moveMob);
		t.start();
	}
	
	
	
	// After time has expired, the mob will be set to the next tile's mob list
	//   and removed from the current one
	// If there is no more set path, the mob will only be removed from the tile's mob list
	private class MoveMobListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (next != null) {
				if (mobList.size() != 0)
					next.addMobs(removeMob());
				else
					return;
			}
			else {
				if (mobList.size() != 0)
					removeMob();
				else
					return;
			}
		}
	}
	
	public int getMobSpeed() {
		return mobList.get(0).getMoveSpeed() * 100;
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
	
//	public void setHasTower(boolean hasTower) {
//		this.hasTower = hasTower;
//	}
	
	public boolean isEmpty() {
		return !hasMob() && !hasTower();
	}
	
//	public void setIsEmpty(boolean isEmpty) {
//		this.isEmpty = isEmpty;
//	}
	
	public boolean hasMob() {
		return mobList.size() != 0;
	}
	
//	public void setHasMob(boolean hasMob) {
//		this.hasMob = hasMob;
//	}
	
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	// Currently set so that a tower can be placed on either land or water *
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	public boolean canPlaceTower() {
		return (isLand || isWater) && (isOnPath() == false);
	}
	
	public boolean isWater() {
		return isWater;
	}
	
	public void setIsWater(boolean isWater) {
		this.isWater = isWater;
	}
	
	public boolean isLand() {
		return isLand;
	}
	
	public void setIsLand(boolean isLand) {
		this.isLand = isLand;
	}
	
	public void setDirection(Directions direction) {
		this.direction = direction;
	}

	public Directions getDirection() {
		return direction;
	}
	
	public void setNextTile(Tile next) {
		this.next = next;
	}
	
	public Tile getNextTile() {
		return next;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getColumn()
	{
		return col;
	}
	
	public Mob removeMob() {
		if (mobList.size() != 0)
			return mobList.remove(0);
		else
			return null;
	}
	
	public ArrayList<Mob> getMobs()
	{
		return mobList;
	}
	
	public void setSpawnerTile(Spawner spawner) {
		this.spawner = spawner;
	}
	
	public Spawner getSpawnerTile() {
		return spawner;
	}
	
}
