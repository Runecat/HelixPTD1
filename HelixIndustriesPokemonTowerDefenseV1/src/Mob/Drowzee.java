package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Drowzee extends Mob{

	public Drowzee(BufferedImage[] b) {
		super(b);
		super.name = "Drowzee";
		super.health = 60;
		super.moveSpeed = 3;
		super.type = Type.PSYCHIC;
		super.money = 6;
	}

}
