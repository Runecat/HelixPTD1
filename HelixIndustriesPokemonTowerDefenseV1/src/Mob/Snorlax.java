package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Snorlax extends Mob{

	public Snorlax(BufferedImage[] b) {
		super(b);
		super.name = "Snorlax";
		super.health = 250;
		super.moveSpeed = 1;
		super.type = Type.NORMAL;
		super.money = 10;	}

}
