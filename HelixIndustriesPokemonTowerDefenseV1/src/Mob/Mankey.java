package Mob;

import java.io.File;

import model.Type;

public class Mankey extends Mob{

	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Mankey(){
		super();
		name = "Mankey";
		health = 20;
		moveSpeed = 5;
		type = Type.FIGHTING;
		money = 3;
	}
}
