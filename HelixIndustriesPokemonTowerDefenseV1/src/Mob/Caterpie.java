package Mob;

import java.io.File;

import model.Type;

public class Caterpie extends Mob{

	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Caterpie(){
		super();
		name = "Caterpie";
		health = 15;
		moveSpeed = 1;
		type = Type.BUG;
		money = 1;
	}
}