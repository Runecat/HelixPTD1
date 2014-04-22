package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Jigglypuff extends Mob{

	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Jigglypuff(BufferedImage b){
		super(b);
		name = "Jigglypuff";
		health = 50;
		moveSpeed = 1;
		type = Type.NORMAL;
		money = 5;
	}
}
