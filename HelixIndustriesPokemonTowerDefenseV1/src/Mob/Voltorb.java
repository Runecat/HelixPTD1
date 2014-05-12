package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Voltorb extends Mob{

	public Voltorb(BufferedImage[] b) {
		super(b);
		super.name = "Voltorb";
		super.health = 20;
		super.moveSpeed = 6;
		super.type = Type.ELECTRIC;
		super.money = 3;
	}

}
