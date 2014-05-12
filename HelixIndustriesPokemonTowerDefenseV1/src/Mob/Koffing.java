package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Koffing extends Mob{

	public Koffing(BufferedImage[] b) {
		super(b);
		super.name = "Koffing";
		super.health = 60;
		super.moveSpeed = 2;
		super.type = Type.POISON;
		super.money = 3;	}

}
