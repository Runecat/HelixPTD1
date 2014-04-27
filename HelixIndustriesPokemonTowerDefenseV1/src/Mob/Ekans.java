package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Ekans extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Ekans(BufferedImage b){
		super(b);
		name = "Ekans";
		health = 25;
		moveSpeed = 3;
		type = Type.POISON;
		money = 2;
	}
}
