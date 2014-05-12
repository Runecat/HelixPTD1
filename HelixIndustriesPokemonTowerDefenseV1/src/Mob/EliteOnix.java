package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteOnix extends Mob{

	public EliteOnix(BufferedImage[] b) {
		super(b);
		super.name = "Onix";
		super.health = 500;
		super.moveSpeed = 6;
		super.type = Type.GROUND;
		super.money = 0;
	}
}
