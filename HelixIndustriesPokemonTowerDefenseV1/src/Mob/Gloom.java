package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Gloom extends Mob{

	public Gloom(BufferedImage[] b) {
		super(b);
		super.name = "Gloom";
		super.health = 55;
		super.moveSpeed = 3;
		super.type = Type.POISON;
		super.money = 5;
	}

}
