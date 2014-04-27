package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Weedle extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Weedle(BufferedImage b){
		super(b);
		name = "Weedle";
		health = 15;
		moveSpeed = 1;
		type = Type.POISON;
		money = 1;
	}
}
