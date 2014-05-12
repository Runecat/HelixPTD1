package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Shellder extends Mob{

	public Shellder(BufferedImage[] b) {
		super(b);
		super.name = "Shellder";
		super.health = 55;
		super.moveSpeed = 2;
		super.type = Type.WATER;
		super.money = 4;
	}
}
