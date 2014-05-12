package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Venomoth extends Mob{

	public Venomoth(BufferedImage[] b) {
		super(b);
		super.name = "Venomoth";
		super.health = 65;
		super.moveSpeed = 5;
		super.type = Type.POISON;
		super.money = 5;
	}

}
