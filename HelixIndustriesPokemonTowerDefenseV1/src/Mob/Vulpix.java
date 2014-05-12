package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Vulpix extends Mob{

	public Vulpix(BufferedImage[] b) {
		super(b);
		super.name = "Vulpix";
		super.health = 45;
		super.moveSpeed = 4;
		super.type = Type.FIRE;
		super.money = 3;
	}
}
