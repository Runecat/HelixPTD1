package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import attacks.Effect;
import maps.Map;
import model.Clickable;
import model.Directions;
import model.Headquarters;
import model.Tile;
import model.Type;

public abstract class Mob implements Clickable {
	
	// May need location variables
	
	protected String name;
	private BufferedImage image;
	protected int health;
	protected int moveSpeed;
	protected Type type;// Might make into enum
	protected int delay;

	
	private int baseDamage = 1;

	
	private Effect status;
	protected int money;
	private Map track = null;
	public int spawnX;
	public int spawnY;
	public Headquarters HQ;
	public Tile currentTile;

	public Mob(BufferedImage b) {
		image = b;
		delay = 0;
	}
	
	//public void spawnMob(int spawnRow, int spawnCol){
	//	track.setMob(spawnX, spawnY, new Mob());
	//}

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
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
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
