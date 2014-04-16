package model;

import java.io.File;

public class Mob implements Clickable {
	// May need location variables
	private String name = "";
	private int health = 1;
	private int baseDamage = 1;
	private int moveSpeed = 1;
	private int height = 1;
	private int width = 1;
	private Type mobType = Type.NORMAL;// Might make into enum
	private Effect status = null;
	private File image = null;
	private Map track = null;
	public int spawnX;
	public int spawnY;
	public Headquarters HQ;

	public Mob() {
		health = getHealth();
		moveSpeed = getMoveSpeed();
		height = getHeight();
		width = getWidth();
		mobType = getMobType();
		status = getEffect();
		image = getImage();
	}
	
	public void spawnMob(int spawnRow, int spawnCol){
		track.setMob(spawnX, spawnY, new Mob());
	}

	public void moveMob() {
		// might move based on location variables
		while(spawnX != HQ.spawnX && spawnY != HQ.spawnY || health == 0){
			if(track.getTile(spawnX, spawnY).getDirection() == Directions.Right)
				spawnY++;
			else if(track.getTile(spawnX, spawnY).getDirection() == Directions.Up)
				spawnX++;
			else if(track.getTile(spawnX, spawnY).getDirection() == Directions.Left)
				spawnY--;
			else
				spawnX--;
		}
	}

	// Shows the Mob's information ()
	public void showInfo() {

	}

	public Effect getEffect() {
		return status;
	}

	public void setEffect(Effect status) {
		this.status = status;
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public Type getMobType() {
		return mobType;
	}

	public void setMobType(Type mobType) {
		this.mobType = mobType;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map getTrack() {
		return track;
	}

	public void setTrack(Map track) {
		this.track = track;
	}
}
