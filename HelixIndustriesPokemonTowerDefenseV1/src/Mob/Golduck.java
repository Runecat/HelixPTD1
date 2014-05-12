package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Golduck extends Mob{

	public Golduck(BufferedImage[] b) {
		super(b);
		super.name = "Golduck";
		super.health = 55;
		super.moveSpeed = 4;
		super.type = Type.WATER;
		super.money = 6;	}

}
