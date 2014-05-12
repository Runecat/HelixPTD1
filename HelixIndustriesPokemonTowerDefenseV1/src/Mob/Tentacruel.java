package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Tentacruel extends Mob{

	public Tentacruel(BufferedImage[] b) {
		super(b);
		super.name = "Tentacruel";
		super.health = 55;
		super.moveSpeed = 6;
		super.type = Type.WATER;
		super.money = 5;	}

}
