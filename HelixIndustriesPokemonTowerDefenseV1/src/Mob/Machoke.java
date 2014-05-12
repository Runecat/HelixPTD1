package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Machoke extends Mob{

	public Machoke(BufferedImage[] b) {
		super(b);
		super.name = "Machoke";
		super.health = 80;
		super.moveSpeed = 4;
		super.type = Type.FIGHTING;
		super.money = 8;
	}
}
