package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Gloom extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Gloom(BufferedImage b) {
		super(b);
		name = "Gloom";
		health = 55;
		moveSpeed = 3;
		type = Type.POISON;
		money = 5;
	}

}
