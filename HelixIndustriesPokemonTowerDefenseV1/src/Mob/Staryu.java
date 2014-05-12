package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Staryu extends Mob{

	public Staryu(BufferedImage[] b) {
		super(b);
		super.name = "Staryu";
		super.health = 40;
		super.moveSpeed = 6;
		super.type = Type.WATER;
		super.money = 4;
	}
}
