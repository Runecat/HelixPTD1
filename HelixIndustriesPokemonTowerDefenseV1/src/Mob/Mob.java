package Mob;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;

import attacks.Effect;
import maps.Map;
import model.Headquarters;
import model.Tile;
import model.Type;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public abstract class Mob implements Serializable{
	
	// May need location variables
	
	protected String name;
	private BufferedImage[] image = new BufferedImage [9];
	private BufferedImage currentImage;
	protected int health;
	protected int moveSpeed;
	protected Type type;
	protected int delay;

	private int baseDamage = 1;

	private Effect status;
	protected int money;
	private Map track = null;
	public int spawnX;
	public int spawnY;
	public Headquarters HQ;
	public Tile currentTile;

	public Mob(BufferedImage[] b) {
		image = b;
	}
	

	public void setCurrentTile(Tile t) {
		currentTile = t;
	}
	
	public Tile getCurrentTile() {
		return currentTile;
	}
	
	public void setDelay(int i){
		delay = i;
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
		return type;
	}

	public void setMobType(Type mobType) {
		this.type = mobType;
	}

	public BufferedImage getImage() {
		return currentImage;
	}

	public void setImage(BufferedImage[] image) {
		this.image = image;
	}
	
	public void setFire()
	{
		this.currentImage = image[6];
	}
	public void setGrass()
	{
		this.currentImage = image[7];
	}
	public void setElectric()
	{
		this.currentImage = image[8];
	}
	
	public void resetImage()
	{
		this.currentImage = image[0];
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
}
