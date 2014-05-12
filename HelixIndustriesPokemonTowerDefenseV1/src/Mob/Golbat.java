package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Golbat extends Mob{

	public Golbat(BufferedImage[] b) {
		super(b);
		super.name = "Golbat";
		super.health = 450;
		super.moveSpeed = 10;
		super.type = Type.POISON;
		super.money = 0;
	}

}
