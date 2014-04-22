package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Poliwag extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Poliwag(BufferedImage b){
		super(b);
		name = "Poliwag";
		health = 35;
		moveSpeed = 5;
		type = Type.WATER;
		money = 4;
	}
}
