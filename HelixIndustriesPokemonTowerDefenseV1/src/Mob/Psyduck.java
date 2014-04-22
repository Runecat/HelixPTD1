package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Psyduck extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Psyduck(BufferedImage b){
		super(b);
		name = "Psyduck";
		health = 35;
		moveSpeed = 2;
		type = Type.WATER;
		money = 3;
	}

}
