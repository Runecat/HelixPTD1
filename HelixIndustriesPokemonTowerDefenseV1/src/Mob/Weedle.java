package Mob;

import java.io.File;

import model.Type;

public class Weedle extends Mob{

	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Weedle(){
		super();
		name = "Weedle";
		health = 15;
		moveSpeed = 1;
		type = Type.POISON;
		money = 1;
	}
}
