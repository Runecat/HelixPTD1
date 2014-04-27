package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Shellder extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Shellder(BufferedImage b) {
		super(b);
		name = "Shellder";
		health = 55;
		moveSpeed = 2;
		type = Type.WATER;
		money = 4;
	}
}
