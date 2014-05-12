package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Kingler extends Mob{

	public Kingler(BufferedImage[] b) {
		super(b);
		super.name = "Kingler";
		super.health = 100;
		super.moveSpeed = 2;
		super.type = Type.WATER;
		super.money = 8;
	}

}
