package Mob;

import java.awt.image.BufferedImage;


import model.Type;

public class Meowth extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Meowth(BufferedImage b) {
		super(b);
		name = "Meowth";
		health = 45;
		moveSpeed = 5;
		type = Type.NORMAL;
		money = 20;
	}
}
