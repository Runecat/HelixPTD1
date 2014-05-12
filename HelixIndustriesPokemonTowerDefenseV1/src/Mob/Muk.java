package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Muk extends Mob{

	public Muk(BufferedImage[] b) {
		super(b);
		super.name = "Muk";
		super.health = 120;
		super.moveSpeed = 4;
		super.type = Type.POISON;
		super.money = 10;
	}
}
