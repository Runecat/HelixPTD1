package Mob;

import java.io.File;

import model.Type;

public class Pidgey extends Mob{

	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Pidgey(){
		super();
		name = "Pidgey";
		health = 20;
		moveSpeed = 2;
		type = Type.FLYING;
		money = 2;
	}
}
