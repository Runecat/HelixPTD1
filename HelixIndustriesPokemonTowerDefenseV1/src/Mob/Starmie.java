package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Starmie extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Starmie(BufferedImage b) {
		super(b);
		name = "Starmie";
		health = 50;
		moveSpeed = 7;
		type = Type.WATER;
		money = 8;
	}
}
