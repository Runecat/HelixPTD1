package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Arbok extends Mob{

	public Arbok(BufferedImage[] b) {
		super(b);
		super.name = "Arbok";
		super.health = 50;
		super.moveSpeed = 6;
		super.type = Type.POISON;
		super.money = 7;
	}
}
