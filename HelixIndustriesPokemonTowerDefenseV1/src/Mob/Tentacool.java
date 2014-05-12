package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Tentacool extends Mob{

	public Tentacool(BufferedImage[] b) {
		super(b);
		super.name = "Tentacool";
		super.health = 25;
		super.moveSpeed = 4;
		super.type = Type.WATER;
		super.money = 3;	
	}

}
