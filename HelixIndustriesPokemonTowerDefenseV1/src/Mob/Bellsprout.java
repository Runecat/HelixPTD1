package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Bellsprout extends Mob{

	
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public int spawnX = 1;
	public int spawnY = 1;
	
	public Bellsprout(BufferedImage b) {
		super(b);
		name = "Bellsprout";
		health = 40;
		moveSpeed = 2;
		type = Type.GRASS;
		money = 3;
	}

}
