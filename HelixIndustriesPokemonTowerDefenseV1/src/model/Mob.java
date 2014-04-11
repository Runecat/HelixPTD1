package model;

import java.io.File;

public class Mob implements Clickable {
	// May need location variables
	private String name;
	private int health;
	private int baseDamage;
	private int moveSpeed;
	private int height;
	private int width;
	private int mobType;// Might make into enum
	private effect status;
	private File image;

	public Mob() {
		health = getHealth();
		moveSpeed = getMoveSpeed();
		height = getHeight();
		width = getWidth();
		mobType = getMobType();
		status = getEffect();
		image = getImage();
	}


	public void moveMob() {
		// might move based on location variables
	}

	// Shows the Mob's information ()
	public void showInfo() {

	}

	public effect getEffect() {
		return status;
	}

	public void setEffect(effect status) {
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

	public int getMobType() {
		return mobType;
	}

	public void setMobType(int mobType) {
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
}
