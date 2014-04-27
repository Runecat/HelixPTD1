package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Sandshrew extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Sandshrew(BufferedImage b){
		super(b);
		name = "Sandshrew";
		health = 35;
		moveSpeed = 2;
		type = Type.GROUND;
		money = 4;
	}
}
