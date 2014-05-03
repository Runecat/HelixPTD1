package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Voltorb extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Voltorb(BufferedImage b) {
		super(b);
		name = "Voltorb";
		health = 20;
		moveSpeed = 6;
		type = Type.ELECTRIC;
		money = 3;
	}

}
