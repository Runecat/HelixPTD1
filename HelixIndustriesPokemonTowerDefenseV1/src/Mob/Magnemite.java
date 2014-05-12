package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Magnemite extends Mob{

	public Magnemite(BufferedImage[] b) {
		super(b);
		super.name = "Magnemite";
		super.health = 15;
		super.moveSpeed = 3;
		super.type = Type.ELECTRIC;
		super.money = 1;
	}

}
