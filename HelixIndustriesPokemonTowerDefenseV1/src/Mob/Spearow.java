package Mob;

import java.io.File;

import model.Type;

public class Spearow extends Mob{

	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Spearow(){
		super();
		name = "Spearow";
		health = 20;
		moveSpeed = 5;
		type = Type.FLYING;
		money = 4;
	}
}
