package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Geodude extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Geodude(BufferedImage b){
		super(b);
		name = "Geodude";
		health = 75;
		moveSpeed = 2;
		type = Type.ROCK;
		money = 4;
	}
}
