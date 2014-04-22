package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Goldeen extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Goldeen(BufferedImage b){
		super(b);
		name = "Goldeen";
		health = 30;
		moveSpeed = 4;
		type = Type.WATER;
		money = 3;
	}
}
