package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Machop extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Machop(BufferedImage b) {
		super(b);
		name = "Machop";
		health = 60;
		moveSpeed = 2;
		type = Type.FIGHTING;
		money = 4;
	}

}
