package Mob;

import java.awt.image.BufferedImage;
import java.io.File;
import model.Type;

public class Rattata extends Mob{
	/*
	private String name;
	private BufferedImage image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	*/
	public Rattata(BufferedImage[] b){
		super(b);
		super.name = "Rattata";
		super.health = 15;
		super.moveSpeed = 3;
		super.type = Type.NORMAL;
		super.money = 2;
	}
}
