package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Hypno extends Mob{

	public Hypno(BufferedImage[] b) {
		super(b);
		super.name = "Hypno";
		super.health = 75;
		super.moveSpeed = 5;
		super.type = Type.PSYCHIC;
		super.money = 10;	}

}
