package Mob;

import java.io.File;

import model.Type;

public class Geodude extends Mob{
	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Geodude(){
		super();
		name = "Geodude";
		health = 75;
		moveSpeed = 2;
		type = Type.ROCK;
		money = 4;
	}
}
