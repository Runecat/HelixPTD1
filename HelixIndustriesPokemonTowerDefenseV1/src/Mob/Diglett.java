package Mob;

import java.io.File;

import model.Type;

public class Diglett extends Mob{
	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Diglett(){
		super();
		name = "Diglett";
		health = 15;
		moveSpeed = 6;
		type = Type.GROUND;
		money = 3;
	}
}
