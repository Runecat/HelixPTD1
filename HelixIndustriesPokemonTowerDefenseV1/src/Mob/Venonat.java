package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Venonat extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Venonat(BufferedImage b) {
		super(b);
		name = "Venonat";
		health = 45;
		moveSpeed = 3;
		type = Type.POISON;
		money = 4;
	}

}
