package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Machop extends Mob{

	public Machop(BufferedImage[] b) {
		super(b);
		super.name = "Machop";
		super.health = 60;
		super.moveSpeed = 2;
		super.type = Type.FIGHTING;
		super.money = 4;
	}

}
