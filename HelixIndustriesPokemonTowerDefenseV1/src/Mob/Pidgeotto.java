package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Pidgeotto extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Pidgeotto(BufferedImage b) {
		super(b);
		name = "Oddish";
		health = 50;
		moveSpeed = 5;
		type = Type.FLYING;
		money = 7;
	}

}
