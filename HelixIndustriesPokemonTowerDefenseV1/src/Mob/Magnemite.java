package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Magnemite extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Magnemite(BufferedImage b) {
		super(b);
		name = "Magnemite";
		health = 15;
		moveSpeed = 3;
		type = Type.ELECTRIC;
		money = 1;
	}

}
