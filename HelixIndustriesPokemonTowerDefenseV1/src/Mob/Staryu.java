package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Staryu extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Staryu(BufferedImage b) {
		super(b);
		name = "Staryu";
		health = 40;
		moveSpeed = 6;
		type = Type.WATER;
		money = 4;
	}
}
