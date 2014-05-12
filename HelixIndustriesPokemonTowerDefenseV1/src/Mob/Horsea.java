package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Horsea extends Mob{

	public Horsea(BufferedImage[] b) {
		super(b);
		super.name = "Horsea";
		super.health = 35;
		super.moveSpeed = 3;
		super.type = Type.WATER;
		super.money = 4;
	}

}
