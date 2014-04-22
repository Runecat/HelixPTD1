package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Onix extends Mob{
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Onix(BufferedImage b){
		super(b);
		name = "Onix";
		health = 100;
		moveSpeed = 4;
		type = Type.GROUND;
		money = 10;
	}
}
