package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Tangela extends Mob{

	public Tangela(BufferedImage[] b) {
		super(b);
		super.name = "Tangela";
		super.health = 100;
		super.moveSpeed = 3;
		super.type = Type.GRASS;
		super.money = 7;
	}

}
