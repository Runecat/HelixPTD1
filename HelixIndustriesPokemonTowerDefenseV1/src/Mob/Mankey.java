package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Mankey extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Mankey(BufferedImage b){
		super(b);
		name = "Mankey";
		health = 20;
		moveSpeed = 5;
		type = Type.FIGHTING;
		money = 3;
	}
}
