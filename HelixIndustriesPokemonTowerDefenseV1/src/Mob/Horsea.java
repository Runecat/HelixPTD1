package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Horsea extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Horsea(BufferedImage b) {
		super(b);
		name = "Horsea";
		health = 35;
		moveSpeed = 3;
		type = Type.WATER;
		money = 4;
	}

}
