package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Psyduck extends Mob{

	public Psyduck(BufferedImage[] b){
		super(b);
		super.name = "Psyduck";
		super.health = 35;
		super.moveSpeed = 2;
		super.type = Type.WATER;
		super.money = 3;
	}

}
