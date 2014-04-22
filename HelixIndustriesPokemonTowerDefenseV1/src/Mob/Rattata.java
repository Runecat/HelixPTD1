package Mob;

import java.io.File;
import model.Type;

public class Rattata extends Mob{
	private String name;
	private File image;
	private int health;
	private int moveSpeed;
	private Type type;
	private int money;
	
	public Rattata(){
		super();
		name = "Rattata";
		health = 15;
		moveSpeed = 3;
		type = Type.NORMAL;
		money = 2;
	}
}
